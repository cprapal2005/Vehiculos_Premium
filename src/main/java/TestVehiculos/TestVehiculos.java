package TestVehiculos;

import java.awt.EventQueue;
import Vista.VentanaPrincipal;

public class TestVehiculos {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Class.forName("org.sqlite.JDBC");
                    VentanaPrincipal frame = new VentanaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
    }

}