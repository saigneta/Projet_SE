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
 * @author Abdoul Aziz LO
 */
public class Tarifs_Chauffeurs extends javax.swing.JFrame {
Connection co=null;
        Statement st=null;
        ResultSet Rs=null;
DefaultTableModel model=new DefaultTableModel();
    /**
     * Creates new form tarifs_chauffeurs
     */
    public Tarifs_Chauffeurs() {
        initComponents();
         model.addColumn("ID TARIFS CHAUFFEURS");
        model.addColumn("ID_VILLE");
        model.addColumn("INTERIEUR DU PAYS");
        model.addColumn("HORS DU PAYS");
        try 
        {
            ResultSet Rs=st.executeQuery("Select * from tarifs_chauffeurs");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("ID TARIFS CHAUFFEURS"),Rs.getString("ID_VILLE"),Rs.getString("INTERIEUR DU PAYS"),
                Rs.getString("HORS DU PAYS")});
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
        ITC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        V = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IP = new javax.swing.JTextField();
        HP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AJ = new javax.swing.JButton();
        EFF = new javax.swing.JButton();
        ar = new javax.swing.JButton();
        qt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("TARIFS CHAUFFEURS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText(" ID TARIFS CHAUFFEURS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText(" ID_VILLE");

        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText(" INTERIEUR DU PAYS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText(" HORS PAYS");

        AJ.setBackground(new java.awt.Color(255, 255, 255));
        AJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AJ.setForeground(new java.awt.Color(51, 51, 51));
        AJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/ajouter.jpg"))); // NOI18N
        AJ.setText("       Ajouter");
        AJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AJActionPerformed(evt);
            }
        });

        EFF.setBackground(new java.awt.Color(255, 51, 51));
        EFF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EFF.setForeground(new java.awt.Color(51, 51, 51));
        EFF.setText("Effacer");
        EFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EFFActionPerformed(evt);
            }
        });

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

        qt.setBackground(new java.awt.Color(255, 255, 255));
        qt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qt.setForeground(new java.awt.Color(51, 51, 51));
        qt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/quitter1.png"))); // NOI18N
        qt.setText("     Quiter");
        qt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(383, 383, 383)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(V, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(IP)
                            .addComponent(HP)
                            .addComponent(ITC))
                        .addGap(210, 210, 210))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ITC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(EFF)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void deplace(int i)
    {
        try 
        {
            ITC.setText(model.getValueAt(i,0).toString());
            V.setText(model.getValueAt(i,1).toString());
            IP.setText(model.getValueAt(i,2).toString());
            HP.setText(model.getValueAt(i,3).toString());
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
            ResultSet Rs=st.executeQuery("Select * from tarifs_chauffeurs");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("ID TARIFS CHAUFFEURS"),Rs.getString("ID_VILLE"),Rs.getString("INTERIEUR DU PAYS"),
                Rs.getString("HORS DU PAYS") });
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
    }
    
    private void AJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AJActionPerformed
        // TODO add your handling code here:
       
        int itc=0,ville=0,ip=0,hp=0;
        Connection co=null;
        Statement st=null;
        try{
            
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    }                                   
catch(Exception e){System.out.println("Erreeur Driver");}
        if(ITC.getText().equals("")||V.getText().equals("")||IP.getText().equals("")||HP.getText().equals("")){
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
            
            itc=Integer.parseInt(ITC.getText());
            ville=Integer.parseInt(V.getText());
            ip=Integer.parseInt(IP.getText());
            hp=Integer.parseInt(HP.getText());
            
          
            st.executeUpdate("insert into tarifs_chauffeurs values('"+itc+"','"+ville+"','"+ip+"','"+hp+"')");
            JOptionPane.showConfirmDialog(null,"Donner inserres");
            afficher();
        }
        catch(Exception e){System.out.println("Erreeur sql");}
            
            }
            else{
                JOptionPane.showConfirmDialog(null,"Donner non inserres"); }
    }//GEN-LAST:event_AJActionPerformed
    }
    private void EFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EFFActionPerformed
        // TODO add your handling code here:
       ITC.setText("");
       V.setText("");
       IP.setText("");
       HP.setText("");
    }//GEN-LAST:event_EFFActionPerformed

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed
test_Tarifs_Chauffeurs Tarc=new test_Tarifs_Chauffeurs();
            Tarc.setVisible(true);

        // TODO add your handling code here:
        afficher();
    }//GEN-LAST:event_arActionPerformed

    private void qtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_qtActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VActionPerformed

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
            java.util.logging.Logger.getLogger(Tarifs_Chauffeurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarifs_Chauffeurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarifs_Chauffeurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarifs_Chauffeurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* CreaAJand display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarifs_Chauffeurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AJ;
    private javax.swing.JButton EFF;
    private javax.swing.JTextField HP;
    private javax.swing.JTextField IP;
    private javax.swing.JTextField ITC;
    private javax.swing.JTextField V;
    private javax.swing.JButton ar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton qt;
    // End of variables declaration//GEN-END:variables
}