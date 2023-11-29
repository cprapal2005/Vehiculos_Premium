package Vista;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import Controller.ControllerCRUD;

public class PanelCRUD extends javax.swing.JPanel {
    
    private javax.swing.JButton btLeer;
 
    private javax.swing.JButton btRegistrar;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabelMatricula;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JTable tablaVehiculos;

    private javax.swing.JTextField txtMatricula;

    private javax.swing.JTextField txtMarca;

    private javax.swing.JTextField txtModelo;

    public PanelCRUD() {
        initComponents();
        this.inicializarPanel();
        ControllerCRUD.cargarTabla(tablaVehiculos);
    }	
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public javax.swing.JTextField getTxtMatricula() {
	return txtMatricula;
    }
    
    public void setTxtMatricula(javax.swing.JTextField txtMatricula) {
            this.txtMatricula = txtMatricula;
    }
    
    public javax.swing.JTextField getTxtMarca() {
            return txtMarca;
    }
    
    public void setTxtMarca(javax.swing.JTextField txtMarca) {
            this.txtMarca = txtMarca;
    }
    
    public javax.swing.JTextField getTxtModelo() {
            return txtModelo;
    }

    public void setTxtModelo(javax.swing.JTextField txtModelo) {
            this.txtModelo = txtModelo;
    }
    
    private void inicializarPanel() {
        
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1 = new javax.swing.JScrollPane();

        tablaVehiculos = new javax.swing.JTable();

        txtMarca = new javax.swing.JTextField();

        txtModelo = new javax.swing.JTextField();

        jLabel2 = new javax.swing.JLabel();

        jLabelMatricula = new javax.swing.JLabel();

        txtMatricula = new javax.swing.JTextField();

        btRegistrar = new javax.swing.JButton();

        btLeer = new javax.swing.JButton();

        jLabel1.setText("Marca");

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(

            new Object [][] {

                {null, null, null, null},

                {null, null, null, null},

                {null, null, null, null},

                {null, null, null, null}

            },

            new String [] {

                "Title 1", "Title 2", "Title 3", "Title 4"

            }

        ));

        jScrollPane1.setViewportView(tablaVehiculos);

        txtMarca.setName("marca"); 
        
        txtModelo.setToolTipText("");

        txtModelo.setName("modelo");
        
        jLabel2.setText("Modelo");
        
        jLabelMatricula.setText("Matricula");
        
        txtMatricula.setToolTipText("");
        
        btRegistrar.setText("Registrar");

        btRegistrar.setActionCommand("btRegistrar");

        btRegistrar.setName("btRegistrar");

        btRegistrar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btRegistrarActionPerformed(evt);

            }

        });

        btLeer.setText("Leer");

        btLeer.setToolTipText("");

        btLeer.setName("btLeer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
               layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createSequentialGroup()
                               .addContainerGap()
                               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                       .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
                                       .addGroup(layout.createSequentialGroup()
                                               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                       .addComponent(jLabel1)
                                                       .addComponent(jLabel2)
                                                       .addComponent(jLabelMatricula))
                                               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                       .addComponent(txtModelo)
                                                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                               .addComponent(txtMarca)
                                                               .addComponent(txtMatricula, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                                               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                       .addComponent(btRegistrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                       .addComponent(btLeer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                               .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
               layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createSequentialGroup()
                               .addContainerGap()
                               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                               .addComponent(jLabel1)
                                               .addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                       .addComponent(btRegistrar))
                               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                       .addGroup(layout.createSequentialGroup()
                                               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                       .addComponent(jLabel2)
                                                       .addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                       .addComponent(jLabelMatricula)
                                                       .addComponent(txtMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                       .addGroup(layout.createSequentialGroup()
                                               .addGap(15)
                                               .addComponent(btLeer)))
                               .addGap(26)
                               .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(32, Short.MAX_VALUE))
        );

        this.setLayout(layout);
 
    }
    
    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {										
 
        ControllerCRUD.insertarVehiculo(this, tablaVehiculos);

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
