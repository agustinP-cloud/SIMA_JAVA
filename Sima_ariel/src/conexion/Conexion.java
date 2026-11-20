
package conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    /**
     *
     */
    public static Connection conexion;
    private static final String URL = "jdbc:mysql://localhost:3306/sima_coloquio?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    public static Connection conectar() throws SQLException, ClassNotFoundException {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base: " + e.getMessage());
        }
        return conexion;
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error: " + error);
        }
    }
        public static void main(String[] args) throws SQLException, ClassNotFoundException {
        if (conectar() != null) {
            System.out.println("Conexión exitosa");
        } else {
            System.out.println("No se pudo conectar");
        }
    }
}
    
    

