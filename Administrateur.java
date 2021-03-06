/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agence;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Abdoul Aziz LO
 */
public class Administrateur extends javax.swing.JFrame {
        Connection co=null;
        Statement st=null;
        ResultSet Rs=null;
        DefaultTableModel model=new DefaultTableModel();
    /**
     * Creates new form administrateur
     */
    public Administrateur() {
        initComponents();
        afficher();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        AF = new javax.swing.JButton();
        SUP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tble = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("ADMINSTRATEUR");

        AF.setBackground(new java.awt.Color(204, 255, 204));
        AF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AF.setForeground(new java.awt.Color(51, 51, 51));
        AF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/aactualiser.png"))); // NOI18N
        AF.setText("    Actualiser");
        AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AFActionPerformed(evt);
            }
        });

        SUP.setBackground(new java.awt.Color(204, 255, 204));
        SUP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SUP.setForeground(new java.awt.Color(51, 51, 51));
        SUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/quitter.png"))); // NOI18N
        SUP.setText("       Quitter");
        SUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUPActionPerformed(evt);
            }
        });

        tble.setBackground(new java.awt.Color(204, 255, 204));
        tble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IDENTIFIANT", "NOM", "EMAIL", "TEL", "ID SOCIETE"
            }
        ));
        jScrollPane1.setViewportView(tble);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AF, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                                .addComponent(SUP, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(384, 384, 384))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AF)
                    .addComponent(SUP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(415, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void afficher()
    {
        model.addColumn("IDENTIFIANT");
        model.addColumn("NOM");
        model.addColumn("EMAIL");
        model.addColumn("TEL");
        model.addColumn("ID SOCIETE");
                    try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            co=DriverManager.getConnection("jdbc:mysql://localhost/agence","root","");
            st=co.createStatement();
            Rs=st.executeQuery("select * from administrateur");
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getInt("id_administrateur"),Rs.getString("nom"),Rs.getString("email"),Rs.getString("tel"),Rs.getInt("id_societe")});
            }
                tble.setModel(model);
        }
        catch(Exception e){}
    }
    
    private void AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AFActionPerformed
        // TODO add your handling code here:
   
             Administrateur a=new   Administrateur();
             a.setVisible(true);
            
    }//GEN-LAST:event_AFActionPerformed

    private void SUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUPActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_SUPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AF;
    private javax.swing.JButton SUP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tble;
    // End of variables declaration//GEN-END:variables
}
