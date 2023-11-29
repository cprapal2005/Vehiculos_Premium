package Controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAOs.DAOVehiculoImpl;
import Recursos.Vehiculo;
import Vista.PanelCRUD;

public class ControllerCRUD
{
	public static void cargarTabla( JTable tablaVehiculos)
	{ 
		List<Vehiculo> lstVehiculos = DAOVehiculoImpl.getInstance().getVehiculos();
		
		DefaultTableModel modelo=new DefaultTableModel();
	 
	 
	 modelo.addColumn("Marca");

	 modelo.addColumn("Modelo");

	 modelo.addColumn("Matricula");
         
         modelo.addColumn("DNI CLiente");

	
    
   
	 Object[] registroLeido = new Object [4];
	 
	 for(Vehiculo vehiculo:lstVehiculos)

	 {	 

			registroLeido[0]= vehiculo.getMarca();

			registroLeido[1]= vehiculo.getModelo();

			registroLeido[2]=  vehiculo.getMatricula();
                        
                        registroLeido[3]=  vehiculo.getDniCliente();
	 



		 modelo.addRow(registroLeido);

	 }
	 
	 tablaVehiculos.setModel(modelo);
	}
	
	
	public static boolean insertarVehiculo( PanelCRUD frmVehiculo, JTable tablaVehiculos)
	{ boolean insertado=false;
	Vehiculo vehiculo=new Vehiculo();
	 
	 
	 
	 vehiculo.setMarca(frmVehiculo.getTxtMarca().getText());

	 vehiculo.setModelo(frmVehiculo.getTxtModelo().getText());

	 vehiculo.setMatricula(frmVehiculo.getTxtMatricula().getText());
         
         vehiculo.setDniCliente((String) frmVehiculo.getCmbDniCLientes().getSelectedItem());
         
         
	 
		if (DAOVehiculoImpl.getInstance().insertarVehiculo(vehiculo)!=0)
		{insertado=true;
		cargarTabla( tablaVehiculos);
		}
     return insertado;		
	}
        
        public static boolean actualizarVehiculo( PanelCRUD frmVehiculo, JTable tablaVehiculos)
	{ boolean insertado=false;
	Vehiculo vehiculo=new Vehiculo();
	 
	 
	 
	 vehiculo.setMarca(frmVehiculo.getTxtMarca().getText());

	 vehiculo.setModelo(frmVehiculo.getTxtModelo().getText());

	 vehiculo.setMatricula(frmVehiculo.getTxtMatricula().getText());
         
         vehiculo.setDniCliente((String) frmVehiculo.getCmbDniCLientes().getSelectedItem());
         
         
	 
		if (DAOVehiculoImpl.getInstance().actualizarCoche(vehiculo)!=0)
		{insertado=true;
		cargarTabla( tablaVehiculos);
		}
     return insertado;		
	}
        
        public static boolean borrarVehiculo( PanelCRUD frmVehiculo, JTable tablaVehiculos)
	{ boolean insertado=false;
         
         
	 
		if (DAOVehiculoImpl.getInstance().eliminarVehiculo(frmVehiculo.getTxtMatricula().getText())!=0)
		{insertado=true;
		cargarTabla( tablaVehiculos);
		}
     return insertado;		
	}
	
	
	

}
