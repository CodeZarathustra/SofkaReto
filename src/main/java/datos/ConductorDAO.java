/*Clase de Acceso a Data para realizar la operacion de Insert y Update
 */
package datos;

import static datos.Conexion.close;
import static datos.Conexion.getConnection;
import dominio.Conductor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConductorDAO {

    public static final String SQL_INSERT = "INSERT INTO podio (id_conductor, nombre,Nacionalidad,equipo)VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE podio SET nombre = ?, Nacionalidad= ?, equipo = ? WHERE id_conductor = ?;";

//Metodo Insertar registros en tabla
    public int insertar(Conductor conductor) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, conductor.getIdConductor());
            stmt.setString(2, conductor.getNombre());
            stmt.setString(3, conductor.getNacionalidad());
            stmt.setString(4, conductor.getEquipo());
            //stmt.setInt(5, conductor.getPuesto());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {

                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }

//Metodo para Actualizar registros
    public int actualizar(Conductor conductor) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            // stmt.setInt(1,conductor.getIdConductor());
            stmt.setString(2, conductor.getNombre());
            stmt.setString(3, conductor.getNacionalidad());
            stmt.setString(4, conductor.getEquipo());
            // stmt.setInt(5, conductor.getPuesto());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {

                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }
}
