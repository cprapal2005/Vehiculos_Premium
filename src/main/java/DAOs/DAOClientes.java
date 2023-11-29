
package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class DAOClientes {
    
    private static DAOClientes dao=null;
        String url = "jdbc:sqlite:G:\\Mi unidad\\2023-2024\\Acceso a Datos\\MvcVehiculosBD.db";
        Connection conexion;

	private DAOClientes() {
		super();
	}
        
	public int insertarCliente(JTextField txtDni, JTextField txtNombre) {
		
             try (Connection conexion = DriverManager.getConnection(url)) {

            String sqlInsercion = "INSERT INTO Clientes (nombre, dni) VALUES (?, ?)";

            try (PreparedStatement statement = conexion.prepareStatement(sqlInsercion)) {
                
                statement.setString(1, txtNombre.getText());
                statement.setString(2, txtDni.getText());

                
                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa");
                } else {
                    System.out.println("No se pudo insertar el vehículo");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
            return 1;
            
	}
        
        public void actualizarCliente(JTextField txtDni, JTextField txtNombre) {
            
            try (Connection conexion = DriverManager.getConnection(url)) {

            String sqlUpdate = "UPDATE Clientes SET nombre = ? WHERE dni = ?";

            try (PreparedStatement statement = conexion.prepareStatement(sqlUpdate)) {
                
                statement.setString(1, txtNombre.getText());
                statement.setString(2, txtDni.getText());

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Actualización exitosa");
                } else {
                    System.out.println("No se encontró el cliente con dni: " + txtDni.getText());
                }
            }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }

	public void eliminarCliente(JTextField txtDni) {
		try (Connection conexion = DriverManager.getConnection(url)) {

            String sqlBorrado = "DELETE FROM Clientes WHERE dni = ?";

            try (PreparedStatement statement = conexion.prepareStatement(sqlBorrado)) {
                
                statement.setString(1, txtDni.getText());

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Borrado exitoso");
                } else {
                    System.out.println("No se encontró el cliente con el dni: " + txtDni.getText());
                }
            }
            } catch (SQLException e) {
                e.printStackTrace();
            }
	}

	public ArrayList<String[]> getClientes() {
            
            ArrayList<String[]> listaClientes = new ArrayList<>();
		try {
                this.conexion = DriverManager.getConnection(this.url);
                Statement statement = conexion.createStatement();

                ResultSet resultado = statement.executeQuery("SELECT * FROM Clientes");

                while (resultado.next()) {
                    
                    String nombre = resultado.getString("nombre");
                    String dni = resultado.getString("dni");
                    
                    listaClientes.add(new String[]{nombre, dni});
                    
                }

                resultado.close();
                statement.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOVehiculoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                return listaClientes;
	}

	public void cargarDniCLientes(JComboBox cmbDniCLientes) {
            
            try {
                this.conexion = DriverManager.getConnection(this.url);
                Statement statement = conexion.createStatement();

                ResultSet resultado = statement.executeQuery("SELECT dni FROM Clientes");

                while (resultado.next()) {
                    
                    String dni = resultado.getString("dni");
                    
                    cmbDniCLientes.addItem(dni);
                    
                }

                resultado.close();
                statement.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOVehiculoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
	}

	
	public static DAOClientes getInstance() {
	  if (dao== null) dao =new DAOClientes();
	  
		return dao;
	}
    
}
