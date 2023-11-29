package DAOs;

import java.util.List;

import Recursos.Vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




public class DAOVehiculoImpl implements IDAOVehiculo {
	
	private static DAOVehiculoImpl dao=null;
        String url = "jdbc:sqlite:G:\\Mi unidad\\2023-2024\\Acceso a Datos\\MvcVehiculosBD.db";
        Connection conexion;

	private DAOVehiculoImpl() {
		super();
	}

	@Override
	public int insertarVehiculo(Vehiculo vehiculo) {
		
             try (Connection conexion = DriverManager.getConnection(url)) {

            String sqlInsercion = "INSERT INTO Vehiculos (marca, modelo, matricula, dniCLiente) VALUES (?, ?, ?, ?)";

            try (PreparedStatement statement = conexion.prepareStatement(sqlInsercion)) {
                
                statement.setString(1, vehiculo.getMarca());
                statement.setString(2, vehiculo.getModelo());
                statement.setString(3, vehiculo.getMatricula());
                statement.setString(4, vehiculo.getDniCliente());

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

	public int actualizarCoche(Vehiculo vehiculo) {
            
            try (Connection conexion = DriverManager.getConnection(url)) {

            String sqlUpdate = "UPDATE Vehiculos SET marca = ?, modelo = ?, dniCLiente = ? WHERE matricula = ?";

            try (PreparedStatement statement = conexion.prepareStatement(sqlUpdate)) {
                
                statement.setString(1, vehiculo.getMarca());
                statement.setString(2, vehiculo.getModelo());
                statement.setString(3, vehiculo.getDniCliente());
                statement.setString(4, vehiculo.getMatricula());

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Actualización exitosa");
                } else {
                    System.out.println("No se encontró el vehículo con la matrícula: " + vehiculo.getMatricula());
                }
            }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            return 1;
            
        }

	@Override
	public int eliminarVehiculo(String matricula) {
		try (Connection conexion = DriverManager.getConnection(url)) {

            String sqlBorrado = "DELETE FROM Vehiculos WHERE matricula = ?";

            try (PreparedStatement statement = conexion.prepareStatement(sqlBorrado)) {
                
                statement.setString(1, matricula);

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Borrado exitoso");
                } else {
                    System.out.println("No se encontró el vehículo con la matrícula: " + matricula);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return 1;
	}

	

	

	@Override
	public List<Vehiculo> getVehiculos() {
            
            List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
            
            try {
                this.conexion = DriverManager.getConnection(this.url);
                Statement statement = conexion.createStatement();

                ResultSet resultado = statement.executeQuery("SELECT * FROM Vehiculos");

                while (resultado.next()) {
                    
                    String marca = resultado.getString("marca");
                    String modelo = resultado.getString("modelo");
                    String matricula = resultado.getString("matricula");
                    String dniCLiente = resultado.getString("dniCLiente");
                    
                    listaVehiculos.add(new Vehiculo(marca, modelo, matricula, dniCLiente));
                    
                }

                resultado.close();
                statement.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOVehiculoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return listaVehiculos;
            
	}

	
	public static DAOVehiculoImpl getInstance() {
	  if (dao== null) dao =new DAOVehiculoImpl();
	  
		return dao;
	}
        
        @Override
	public Vehiculo getVehiculo(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}
        
	@Override
	public int eliminarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return 0;
	}
        
        @Override   
	public int eliminarVehiculos(String dniCliente) {
		
            try (Connection connection = DriverManager.getConnection(url)) {
                
            String sql = "DELETE FROM Vehiculos WHERE dniCLiente = ?";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                
                statement.setString(1, dniCliente);
                
                
                int filasAfectadas = statement.executeUpdate();
                
                
                if (filasAfectadas > 0) {
                    System.out.println("Se borraron " + filasAfectadas + " vehículos asociados al cliente con DNI " + dniCliente);
                } else {
                    System.out.println("No se encontraron vehículos asociados al cliente con DNI " + dniCliente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
		return 0;
	}
        
}
