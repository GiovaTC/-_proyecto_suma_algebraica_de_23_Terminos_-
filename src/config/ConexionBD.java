package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ==========================================================
 * Clase: ConexionBD
 * Proyecto: SumaAlgebraica23Terminos
 * Autor: Giovanny A. Tapiero C. :. . /  .
 * Java: 21
 * Base de Datos: MySQL 8
 * ==========================================================
 *
 * Responsabilidades:
 * - Abrir conexión con MySQL.
 * - Cerrar conexión.
 * - Ejecutar sentencias INSERT, UPDATE y DELETE.
 * - Ejecutar consultas SELECT.
 *
 * ==========================================================
 */

public class ConexionBD {

    // URL de conexion
    private static final String URL =
            "jdbc:mysql://localhost:3306/suma_algebraica_db"
            + "?useSSL=false"
            + "&serverTimezone=UTC"
            + "&allowPublicKeyRetrieval=true";

    // usuario y contraseña de MYSQL .
    private static final String USUARIO = "root";
    private static final String PASSWORD = "Tapiero123";

    private Connection conexion;

    /**
     *  constructor.
     */
    public ConexionBD() {
        conexion =  null;
    }

    /**
     * abre una conexion con MYSQL .
     *
     * @return CONNECTION.
     */
    public Connection conectar() {
        try {
            if (conexion == null || conexion.isClosed()) {

                conexion = DriverManager.getConnection(
                        URL,
                        USUARIO,
                        PASSWORD
                );

                System.out.println("-------------------------------------------");
                System.out.println("Conexión a MySQL establecida correctamente.");
                System.out.println("-------------------------------------------");
            }
        } catch (SQLException e) {
            System.err.println("-------------------------------------------");
            System.err.println("Error al conectar con MySQL.");
            System.err.println(e.getMessage());
            System.err.println("-------------------------------------------");
        }

        return conexion;
    }

    /**
     * Cierra la conexión.
     */
    public void cerrarConexion() {

        try {
            if (conexion != null && !conexion.isClosed()) {

                conexion.close();

                System.out.println("-------------------------------------------");
                System.out.println("Conexión cerrada correctamente.");
                System.out.println("-------------------------------------------");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión.");
            System.err.println(e.getMessage());
        }
    }
    /**
     * Ejecuta INSERT, UPDATE o DELETE.
     *
     * @param sql Sentencia SQL
     * @param parametros Parámetros del PreparedStatement
     * @return true si fue exitoso
     */
    public boolean ejecutarActualizacion(
            String sql,
            Object... parametros
    ) {

        try (PreparedStatement ps =
                     conectar().prepareStatement(sql)) {

            for (int i = 0; i < parametros.length; i++) {

                ps.setObject(i + 1, parametros[i]);

            }

            int filas = ps.executeUpdate();

            return filas > 0;

        } catch (SQLException e) {

            System.err.println("-------------------------------------------");
            System.err.println("Error al ejecutar actualización.");
            System.err.println(e.getMessage());
            System.err.println("-------------------------------------------");

            return false;

        }
    }
    /**
     * Ejecuta una consulta SELECT.
     *
     * El ResultSet debe cerrarse después de utilizarse.
     *
     * @param sql Consulta SQL
     * @param parametros Parámetros
     * @return ResultSet
     */
    public ResultSet ejecutarConsulta(
            String sql,
            Object... parametros
    ) {
        try {

            PreparedStatement ps =
                    conectar().prepareStatement(sql);

            for (int i = 0; i < parametros.length; i++) {

                ps.setObject(i + 1, parametros[i]);
            }

            return ps.executeQuery();

        } catch (SQLException e) {

            System.err.println("-------------------------------------------");
            System.err.println("Error al ejecutar consulta.");
            System.err.println(e.getMessage());
            System.err.println("-------------------------------------------");

            return null;
        }
    }

    /**
     * Obtiene la conexión actual.
     *
     * @return Connection
     */
    public Connection getConexion() {
        return conexion;
    }   
}
