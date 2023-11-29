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
	
	private static IDAOVehiculo dao=null;
        String url = "jdbc:sqlite:C:\\Users\\dam\\Desktop\\MvcVehiculosBD.db";
        Connection conexion;

	private DAOVehiculoImpl() {
		super();
	}

	@Override
	public int insertarVehiculo(Vehiculo vehiculo) {
		
             try (Connection conexion = DriverManager.getConnection(url)) {

            // Consulta SQL para la inserción
            String sqlInsercion = "INSERT INTO Vehiculo (marca, modelo, matricula, dniCLiente) VALUES (?, ?, ?, ?)";

            try (PreparedStatement statement = conexion.prepareStatement(sqlInsercion)) {
                // Establecer los valores de los parámetros
                statement.setString(1, vehiculo.getMarca());
                statement.setString(2, vehiculo.getModelo());
                statement.setString(3, vehiculo.getMatricula());
                statement.setString(4, vehiculo.getDniCliente());

                // Ejecutar la inserción
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

	

	@Override
	public int eliminarVehiculo(String matricula) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarVehiculos(List<Vehiculo> lstVehiculos) {
		
		return 0;
	}

	@Override
	public Vehiculo getVehiculo(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo> getVehiculos() {
            
            List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
            
            try {
                this.conexion = DriverManager.getConnection(this.url);
                Statement statement = conexion.createStatement();

                ResultSet resultado = statement.executeQuery("SELECT * FROM Vehiculos");

                while (resultado.next()) {
                    // Procesar resultados
                    String marca = resultado.getString("marca");
                    String modelo = resultado.getString("modelo");
                    String matricula = resultado.getString("matricula");
                    String dniCLiente = resultado.getString("dniCLiente");
                    
                    listaVehiculos.add(new Vehiculo(marca, modelo, matricula, dniCLiente));
                    
                }

                // Cerrar recursos
                resultado.close();
                statement.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOVehiculoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return listaVehiculos;
            
	}

	
	public static IDAOVehiculo getInstance() {
	  if (dao== null) dao =new DAOVehiculoImpl();
	  
		return dao;
	}

	@Override
	public int eliminarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
