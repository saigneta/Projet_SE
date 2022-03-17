/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ibrahima Diakhate
 */
public class Factures extends javax.swing.JFrame {
 Connection co=null;
        Statement st=null;
        ResultSet Rs=null;
DefaultTableModel model=new DefaultTableModel();
    /**
     * Creates new form factures
     */
    public Factures() {
        initComponents();
         
        model.addColumn("idfactures");
        model.addColumn("idlocation");
        model.addColumn("date");
        try 
        {
            ResultSet Rs=st.executeQuery("Select * from factures");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("idfactures"),Rs.getString("idlocation"),Rs.getString("date")});
            }
        }catch(Exception e){System.err.println(e);}
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IF = new javax.swing.JTextField();
        IL = new javax.swing.JTextField();
        AJ = new javax.swing.JButton();
        EFF = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DT = new javax.swing.JTextField();
        ar = new javax.swing.JButton();
        QT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("    FACTURES");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ID FACTURS");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("ID LOCATIONS");

        AJ.setBackground(new java.awt.Color(255, 255, 255));
        AJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AJ.setForeground(new java.awt.Color(51, 51, 51));
        AJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/ajouter.jpg"))); // NOI18N
        AJ.setText("          Ajouter");
        AJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AJActionPerformed(evt);
            }
        });

        EFF.setBackground(new java.awt.Color(153, 0, 0));
        EFF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EFF.setForeground(new java.awt.Color(255, 255, 255));
        EFF.setText("Effacer");
        EFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EFFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("DATE");

        ar.setBackground(new java.awt.Color(255, 255, 255));
        ar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ar.setForeground(new java.awt.Color(51, 51, 51));
        ar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/afficher - Copie.png"))); // NOI18N
        ar.setText("        Afficher");
        ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arActionPerformed(evt);
            }
        });

        QT.setBackground(new java.awt.Color(255, 255, 255));
        QT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        QT.setForeground(new java.awt.Color(51, 51, 51));
        QT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/quitter1.png"))); // NOI18N
        QT.setText("         Quiter");
        QT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(296, 296, 296)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DT, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DT, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ar)
                    .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void deplace(int i)
    {
        try 
        {
            IF.setText(model.getValueAt(i,0).toString());
            IL.setText(model.getValueAt(i,1).toString());
            DT.setText(model.getValueAt(i,2).toString());
        }
        catch (Exception e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Erreur de déplacement"+e.getLocalizedMessage());
        }
    }

    private void afficher()
    {
        try 
        {
            model.setRowCount(0);
            ResultSet Rs=st.executeQuery("Select * from factures");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("idfactures"),Rs.getString("idlocation"),Rs.getString("date") });
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
    }
    private void AJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AJActionPerformed
        // TODO add your handling code here:
        int idt=0,ids=0;
        int d=0;
        Connection co=null;
        Statement st=null;
        try{
            
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    }                                   
catch(Exception e){System.out.println("Erreeur Driver");}
        if(IF.getText().equals("")||IL.getText().equals("")||DT.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Remplire tous les champs ");
        }
        else{
            if(JOptionPane.showConfirmDialog(null,"Voulez vous enregistre", "CONFIRMATION", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        try{
            co=DriverManager.getConnection("jdbc:mysql://localhost/agence","root","");
            st=co.createStatement();
        }
        
        catch(Exception e){System.out.println("Erreeur connexion");}
        try{
           
            idt=Integer.parseInt(IF.getText());
            ids=Integer.parseInt(IL.getText());
           
            st.executeUpdate("insert into factures(idfactures,idlocation,date) values('"+idt+"','"+ids+"','"+d+"')");
            JOptionPane.showConfirmDialog(null,"Donner inserres");
            afficher();
        }
        catch(Exception e){System.out.println("Erreeur sql");}
            
            }
            else{
                JOptionPane.showConfirmDialog(null,"Donner non inserres"); }
            }
    }//GEN-LAST:event_AJActionPerformed

    private void EFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EFFActionPerformed
        // TODO add your handling code here:
        IF.setText("");
        IL.setText("");
         DT.setText("");
    }//GEN-LAST:event_EFFActionPerformed

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed
        test_Factures fac =new test_Factures();
            fac.setVisible(true);

        // TODO add your handling code here:
        afficher();
    }//GEN-LAST:event_arActionPerformed

    private void QTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QTActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_QTActionPerformed

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
            java.util.logging.Logger.getLogger(Factures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AJ;
    private javax.swing.JTextField DT;
    private javax.swing.JButton EFF;
    private javax.swing.JTextField IF;
    private javax.swing.JTextField IL;
    private javax.swing.JButton QT;
    private javax.swing.JButton ar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}