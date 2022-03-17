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
public class Clients extends javax.swing.JFrame {
     Connection co=null;
        Statement st=null;
        ResultSet Rs=null;
DefaultTableModel model=new DefaultTableModel();

    /**
     * Creates new form clients
     */
    public Clients() {
        initComponents();
        
        model.addColumn("IDENTIFIANT");
        model.addColumn("NOM");
        model.addColumn("ADRESS");
        model.addColumn("TELEPHON");
        model.addColumn("CI");
        model.addColumn("EMAIL");
        try 
        {
            ResultSet Rs=st.executeQuery("Select * from clients");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("IDENTIFIANT"),Rs.getString("NOM"),Rs.getString("ADRESS"),
                Rs.getString("TELEPHON"),Rs.getString("CI"),Rs.getString("EMAIL")});
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
        jLabel7 = new javax.swing.JLabel();
        AJ = new javax.swing.JButton();
        EFF = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        NM = new javax.swing.JTextField();
        AD = new javax.swing.JTextField();
        TL = new javax.swing.JTextField();
        CI = new javax.swing.JTextField();
        EM = new javax.swing.JTextField();
        ar = new javax.swing.JButton();
        QT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("      CLIENTS");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("IDENTIFIANT");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("NOM");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("ADRESS");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("TELEPHONE");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText(" CI");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("EMAIL");

        AJ.setBackground(new java.awt.Color(255, 255, 255));
        AJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AJ.setForeground(new java.awt.Color(51, 51, 51));
        AJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/ajouter.jpg"))); // NOI18N
        AJ.setText("            Ajouter");
        AJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AJActionPerformed(evt);
            }
        });

        EFF.setBackground(new java.awt.Color(51, 255, 51));
        EFF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EFF.setForeground(new java.awt.Color(102, 0, 0));
        EFF.setText("Effacer");
        EFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EFFActionPerformed(evt);
            }
        });

        NM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NMActionPerformed(evt);
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

        QT.setBackground(new java.awt.Color(255, 255, 255));
        QT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        QT.setForeground(new java.awt.Color(51, 51, 51));
        QT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/quitter1.png"))); // NOI18N
        QT.setText("          Quiter");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(AD, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TL, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID))
                                .addGap(184, 184, 184)
                                .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(110, 144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID)
                                .addGap(2, 2, 2)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NM, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(CI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void deplace(int i)
    {
        try 
        {
            ID.setText(model.getValueAt(i,0).toString());
            NM.setText(model.getValueAt(i,1).toString());
            AD.setText(model.getValueAt(i,2).toString());
            TL.setText(model.getValueAt(i,3).toString());
            CI.setText(model.getValueAt(i,4).toString());
            EM.setText(model.getValueAt(i,5).toString());
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
            ResultSet Rs=st.executeQuery("Select * from clients");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("IDENTIFIANT"),Rs.getString("NOM"),Rs.getString("ADRESS"),
                Rs.getString("TELEPHON"),Rs.getString("CI"),Rs.getString("EMAIL") });
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
       
    }
    private void NMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NMActionPerformed

    private void AJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AJActionPerformed
        // TODO add your handling code here:
         String nom=null,email=null,tel=null,ci=null,ad=null;
        int idt=0;
        Connection co=null;
        Statement st=null;
        try{
            
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    }                                   
catch(Exception e){System.out.println("Erreeur Driver");}
        if(ID.getText().equals("")||NM.getText().equals("")||EM.getText().equals("")||TL.getText().equals("")||CI.getText().equals("")||AD.getText().equals("")){
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
            nom=NM.getText();
            idt=Integer.parseInt(ID.getText());
            ad=AD.getText();
            email=EM.getText();
            ci=EM.getText();
            tel=CI.getText();
            st.executeUpdate("insert into clients(idclients,client,adresse,tel,numci,email) values('"+idt+"','"+nom+"','"+ad+"','"+tel+"','"+ci+"','"+email+"')");
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
         ID.setText("");
        NM.setText("");
        EM.setText("");
        TL.setText("");
        CI.setText("");
        AD.setText("");
    }//GEN-LAST:event_EFFActionPerformed

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed

test_Clients Cli=new test_Clients();
            Cli.setVisible(true);
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
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AD;
    private javax.swing.JButton AJ;
    private javax.swing.JTextField CI;
    private javax.swing.JButton EFF;
    private javax.swing.JTextField EM;
    private javax.swing.JTextField ID;
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
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}