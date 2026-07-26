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

    


}
