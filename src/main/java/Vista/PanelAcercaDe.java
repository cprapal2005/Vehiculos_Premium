package Vista;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class PanelAcercaDe extends javax.swing.JPanel {

    public PanelAcercaDe() {
        initComponents();
        JLabel lblNewLabel = new JLabel("Aplicaci\u00F3n con modelo vista y controlador");
        lblNewLabel.setForeground(Color.BLUE);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
        this.add(lblNewLabel);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
