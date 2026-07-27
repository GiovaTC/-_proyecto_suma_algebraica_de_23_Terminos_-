package dao;

import config.ConexionBD;
import modelo.Termino;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * Clase: SumaDAO
 * Proyecto: SumaAlgebraica23Terminos
 * Autor: Giovanny A. Tapiero C. :. . / .
 * Java: 21
 * Base de Datos: MySQL 8
 * ==========================================================
 *
 * Responsabilidades
 * - Guardar una operación.
 * - Consultar historial.
 * ==========================================================
 */
public class SumaDAO {

    private final ConexionBD conexion;

    public SumaDAO() {
        conexion = new ConexionBD();
    }

    /**
     * Guarda una operacion en la base de datos.
     */
    public boolean guardarOperacion(Termino t) {

        String sql = """
                INSERT INTO operaciones(
                termino1, termino2, termino3, termino4, termino5,
                termino6, termino7, termino8, termino9, termino10,
                termino11, termino12, termino13, termino14, termino15,
                termino16, termino17, termino18, termino19, termino20,
                termino21, termino22, termino23,
                resultado)
                VALUES(
                ?,?,?,?,?,?,?,?,?,?,
                ?,?,?,?,?,?,?,?,?,?,
                ?,?,?,?)
                """;

        try (PreparedStatement ps =
                conexion.conectar().prepareStatement(sql)) {

            ps.setDouble(1, t.getTermino1());
            ps.setDouble(2, t.getTermino2());
            ps.setDouble(3, t.getTermino3());
            ps.setDouble(4, t.getTermino4());
            ps.setDouble(5, t.getTermino5());

            ps.setDouble(6, t.getTermino6());
            ps.setDouble(7, t.getTermino7());
            ps.setDouble(8, t.getTermino8());
            ps.setDouble(9, t.getTermino9());
            ps.setDouble(10, t.getTermino10());

            ps.setDouble(11, t.getTermino11());
            ps.setDouble(12, t.getTermino12());
            ps.setDouble(13, t.getTermino13());
            ps.setDouble(14, t.getTermino14());
            ps.setDouble(15, t.getTermino15());

            ps.setDouble(16, t.getTermino16());
            ps.setDouble(17, t.getTermino17());
            ps.setDouble(18, t.getTermino18());
            ps.setDouble(19, t.getTermino19());
            ps.setDouble(20, t.getTermino20());

            ps.setDouble(21, t.getTermino21());
            ps.setDouble(22, t.getTermino22());
            ps.setDouble(23, t.getTermino23());

            ps.setDouble(24, t.getResultado());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("\nOperación guardada correctamente.");
                return true;
            }
        } catch (SQLException e) {

            System.out.println("Error al guardar la operación.");
            System.out.println(e.getMessage());
        }

        return false;
    }

    /**
     * Consulta todas las operaciones .
     */
    public List<Termino> listarOperaciones() {

        List<Termino> lista = new ArrayList<>();

        String sql = """
                SELECT *
                FROM operaciones
                ORDER BY id
                """;

        try (PreparedStatement ps =
                     conexion.conectar().prepareStatement(sql);

             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Termino t = new Termino();

                t.setId(rs.getInt("id"));

                t.setTermino1(rs.getDouble("termino1"));
                t.setTermino2(rs.getDouble("termino2"));
                t.setTermino3(rs.getDouble("termino3"));
                t.setTermino4(rs.getDouble("termino4"));
                t.setTermino5(rs.getDouble("termino5"));

                t.setTermino6(rs.getDouble("termino6"));
                t.setTermino7(rs.getDouble("termino7"));
                t.setTermino8(rs.getDouble("termino8"));
                t.setTermino9(rs.getDouble("termino9"));
                t.setTermino10(rs.getDouble("termino10"));

                t.setTermino11(rs.getDouble("termino11"));
                t.setTermino12(rs.getDouble("termino12"));
                t.setTermino13(rs.getDouble("termino13"));
                t.setTermino14(rs.getDouble("termino14"));
                t.setTermino15(rs.getDouble("termino15"));

                t.setTermino16(rs.getDouble("termino16"));
                t.setTermino17(rs.getDouble("termino17"));
                t.setTermino18(rs.getDouble("termino18"));
                t.setTermino19(rs.getDouble("termino19"));
                t.setTermino20(rs.getDouble("termino20"));

                t.setTermino21(rs.getDouble("termino21"));
                t.setTermino22(rs.getDouble("termino22"));
                t.setTermino23(rs.getDouble("termino23"));

                t.setResultado(rs.getDouble("resultado"));

                Timestamp fecha = rs.getTimestamp("fecha");

                if (fecha != null) {
                    t.setFecha(fecha.toLocalDateTime());
                }

                lista.add(t);

            }

        } catch (SQLException e) {

            System.out.println("Error al consultar operaciones.");
            System.out.println(e.getMessage());

        }

        return lista;
    }

    /**
     * Muestra el historial por consola .
     */

    public void mostrarHistorial() {
        List<Termino> operaciones = listarOperaciones();

        System.out.println();
        System.out.println("===============================================");
        System.out.println("      HISTORIAL DE SUMAS ALGEBRAICAS");
        System.out.println("===============================================");

        if (operaciones.isEmpty()) {

            System.out.println("No existen registros.");
            return;

        }

        for (Termino t : operaciones) {

            System.out.println("-----------------------------------------------");
            System.out.println("ID        : " + t.getId());
            System.out.println("Resultado : " + t.getResultado());
            System.out.println("Fecha     : " + t.getFecha());

        }
        System.out.println("-----------------------------------------------");
    }

    /**
     * Cierra la conexion .
     */
    public void cerrarConexion() {
        conexion.cerrarConexion();
    }   
}
