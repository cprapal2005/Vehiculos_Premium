package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JPanel panelActivo = null;
    private JMenuItem itemAcerca, itemCRUD, itemSalir, itemJuego;
    
    public VentanaPrincipal() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 615, 404);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu MenuFile = new JMenu("File");
        menuBar.add(MenuFile);

        itemCRUD = new JMenuItem("CRUD");
        MenuFile.add(itemCRUD);
        itemCRUD.addActionListener(this);

        itemJuego = new JMenuItem("Jugar");
        MenuFile.add(itemJuego);
        itemJuego.addActionListener(this);

        itemAcerca = new JMenuItem("Acerca de...");

        MenuFile.add(itemAcerca);
        itemAcerca.addActionListener(this);

        itemSalir = new JMenuItem("Salir");
        MenuFile.add(itemSalir);
        itemSalir.addActionListener(this);
        
        this.panelActivo = new PanelCRUD();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== itemSalir) System.exit(0);

        else if (e.getSource()== itemAcerca) cambiarPanel(new PanelAcercaDe());
        
        else if (e.getSource()== itemCRUD) cambiarPanel(new PanelCRUD());
        
        else if (e.getSource()== itemJuego) cambiarPanel(new PanelJuego());

    }
    
    public void cambiarPanel(JPanel panel) {
        panelActivo.setVisible(false);
        this.getContentPane().remove(panelActivo);
        panelActivo=panel;
        this.getContentPane().add(panelActivo);
        panelActivo.setSize(this.getSize());
        panelActivo.setVisible(true);
        panelActivo.updateUI();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
