/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdoul Aziz LO
 */
public class Succursalles extends javax.swing.JFrame {
 Connection co=null;
        Statement st=null;
        ResultSet Rs=null;
DefaultTableModel model=new DefaultTableModel();

    /**
     * Creates new form Succursalles
     */
    public Succursalles() {
        initComponents();
        model.addColumn("ID SUCCURSALLE");
        model.addColumn("NOM");
        model.addColumn("ADRESS");
        model.addColumn("TEL");
        model.addColumn("ID SOCIETE");
        try 
        {
            ResultSet Rs=st.executeQuery("Select * from succursalles");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("id_succursalle"),Rs.getString("nom"),Rs.getString("adresse"),
                Rs.getString("tel"),Rs.getString("id_societe")});
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IS = new javax.swing.JTextField();
        NM = new javax.swing.JTextField();
        AE = new javax.swing.JTextField();
        TL = new javax.swing.JTextField();
        IE = new javax.swing.JTextField();
        AJ = new javax.swing.JButton();
        EFF = new javax.swing.JButton();
        QT = new javax.swing.JButton();
        ar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SUCCURSALLES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("ID SUCCURSALLE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("NOM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("ADRESSE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("TEL");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("ID SOCIETE");

        IS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISActionPerformed(evt);
            }
        });

        NM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NMActionPerformed(evt);
            }
        });

        AJ.setBackground(new java.awt.Color(255, 255, 255));
        AJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AJ.setForeground(new java.awt.Color(51, 51, 51));
        AJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/ajouter.jpg"))); // NOI18N
        AJ.setText("        Ajouter");
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

        QT.setBackground(new java.awt.Color(255, 255, 255));
        QT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        QT.setForeground(new java.awt.Color(51, 51, 51));
        QT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/quitter1.png"))); // NOI18N
        QT.setText("            Quiter");
        QT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QTActionPerformed(evt);
            }
        });

        ar.setBackground(new java.awt.Color(255, 255, 255));
        ar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ar.setForeground(new java.awt.Color(51, 51, 51));
        ar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/afficher - Copie.png"))); // NOI18N
        ar.setText("         Afficher");
        ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IS, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(NM)
                            .addComponent(AE)
                            .addComponent(TL)
                            .addComponent(IE))
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)))
                .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(486, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(IS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(NM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4))
                            .addComponent(AE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(IE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(312, 312, 312)
                        .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void deplace(int i)
    {
        try 
        {
            IS.setText(model.getValueAt(i,0).toString());
            NM.setText(model.getValueAt(i,1).toString());
            AE.setText(model.getValueAt(i,2).toString());
            TL.setText(model.getValueAt(i,3).toString());
            IE.setText(model.getValueAt(i,4).toString());
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
            ResultSet Rs=st.executeQuery("Select * from succursalles");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("id_succursalle"),Rs.getString("nom"),Rs.getString("adresse"),
                Rs.getString("tel"),Rs.getString("id_societe") });
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
    }
    
    private void AJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AJActionPerformed
        // TODO add your handling code here:
         String nom=null,adresse=null,tel=null;
        int idsuc=0,idsoc=0;
        Connection co=null;
        Statement st=null;
        try{
            
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch(Exception e){System.out.println("Erreur driver");}
        try{
            co=DriverManager.getConnection("jdbc:mysql://localhost/agence","root","");
            st=co.createStatement();
        }catch(Exception e){System.out.println("Erreur connexion");}
        if(IS.getText().equals("")||NM.getText().equals("")||AE.getText().equals("")||TL.getText().equals("")||IE.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Remplir tous les champs");
        }
        else{
            if(JOptionPane.showConfirmDialog(null,"Voulez-vous enregistrer?","CONFIRMATION",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        try{
            nom=NM.getText();
            adresse=AE.getText();
            tel=TL.getText();
            idsuc=Integer.parseInt(IS.getText());
            idsoc=Integer.parseInt(IE.getText());
            st.executeUpdate("insert into succursalles(id_succursalle,nom,adresse,tel,id_societe) values('"+idsuc+"','"+nom+"','"+adresse+"','"+tel+"','"+idsoc+"')");
            JOptionPane.showMessageDialog(null,"Données inserees");
            afficher();
        }catch(Exception e){System.out.println("Erreur Sql");}}
            else{
                JOptionPane.showMessageDialog(null,"Données non inserees");
            }
        }
    }//GEN-LAST:event_AJActionPerformed

    private void EFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EFFActionPerformed
        // TODO add your handling code here:
        IS.setText("");NM.setText("");AE.setText("");TL.setText("");IE.setText("");
    }//GEN-LAST:event_EFFActionPerformed

    private void NMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NMActionPerformed

    private void ISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISActionPerformed

    private void QTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QTActionPerformed
        // TODO add your handling code here:
          dispose();
    }//GEN-LAST:event_QTActionPerformed

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed
test_succursalles Suc=new test_succursalles();
            Suc.setVisible(true);

        // TODO add your handling code here:
        afficher();
    }//GEN-LAST:event_arActionPerformed

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
            java.util.logging.Logger.getLogger(Succursalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Succursalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Succursalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Succursalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Succursalles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AE;
    private javax.swing.JButton AJ;
    private javax.swing.JButton EFF;
    private javax.swing.JTextField IE;
    private javax.swing.JTextField IS;
    private javax.swing.JTextField NM;
    private javax.swing.JButton QT;
    private javax.swing.JTextField TL;
    private javax.swing.JButton ar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
