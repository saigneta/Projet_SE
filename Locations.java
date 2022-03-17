/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agence;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import static java.sql.Types.DECIMAL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdoul Aziz LO
 */
public class Locations extends javax.swing.JFrame {
 Connection co=null;
        Statement st=null;
        ResultSet Rs=null;
DefaultTableModel model=new DefaultTableModel();
    /**
     * Creates new form Locations
     */
    public Locations() {
        initComponents();
        model.addColumn("idlocation");
        model.addColumn("date_debut");
        model.addColumn("date_fin");
        model.addColumn("prixht");
        model.addColumn("prixttc");
        model.addColumn("tva");
        model.addColumn("idclients");
        model.addColumn("remise");
        model.addColumn("idsuccursale");
        model.addColumn("tvaremise");
        model.addColumn("netapayer");
        model.addColumn("remarques");
        try 
        {
            ResultSet Rs=st.executeQuery("Select * from locations");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("idlocation"),Rs.getString("date_debut"),Rs.getString("date_fin"),
                Rs.getString("prixht"),Rs.getString("prixttc"),Rs.getString("tva"),
                Rs.getString("idclients"),Rs.getString("remise"),Rs.getString("idsuccursale"),
                Rs.getString("tvaremise"),Rs.getString("netapayer"),Rs.getString("remarques")});
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AJ = new javax.swing.JButton();
        EFF = new javax.swing.JButton();
        IDL = new javax.swing.JTextField();
        DD = new javax.swing.JTextField();
        DF = new javax.swing.JTextField();
        Pt = new javax.swing.JTextField();
        Pc = new javax.swing.JTextField();
        TA = new javax.swing.JTextField();
        IDC = new javax.swing.JTextField();
        RE = new javax.swing.JTextField();
        IDS = new javax.swing.JTextField();
        TR = new javax.swing.JTextField();
        NP = new javax.swing.JTextField();
        RQ = new javax.swing.JTextField();
        QT = new javax.swing.JButton();
        ar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("  LOCATIONS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("ID   LOCATION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("DATE DEBUT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("DATE FIN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("PRIXht");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("PRIXttc");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("TVA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("ID CLIENT");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("REMISE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("ID SURCURSALE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("TVA REMISE");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("NET A PAYER");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("REMARQUE");

        AJ.setBackground(new java.awt.Color(255, 255, 255));
        AJ.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AJ.setForeground(new java.awt.Color(51, 51, 51));
        AJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/ajouter.jpg"))); // NOI18N
        AJ.setText("      Ajouter");
        AJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AJActionPerformed(evt);
            }
        });

        EFF.setBackground(new java.awt.Color(204, 255, 204));
        EFF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EFF.setForeground(new java.awt.Color(51, 51, 51));
        EFF.setText("Effacer");
        EFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EFFActionPerformed(evt);
            }
        });

        IDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDLActionPerformed(evt);
            }
        });

        QT.setBackground(new java.awt.Color(255, 255, 255));
        QT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        QT.setForeground(new java.awt.Color(51, 51, 51));
        QT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/quitter1.png"))); // NOI18N
        QT.setText("        Quiter");
        QT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QTActionPerformed(evt);
            }
        });

        ar.setBackground(new java.awt.Color(255, 255, 255));
        ar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ar.setForeground(new java.awt.Color(51, 51, 51));
        ar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence/afficher - Copie.png"))); // NOI18N
        ar.setText("       Afficher");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RQ)
                            .addComponent(NP)
                            .addComponent(TR)
                            .addComponent(IDS)
                            .addComponent(RE)
                            .addComponent(IDC)
                            .addComponent(TA)
                            .addComponent(Pc)
                            .addComponent(Pt)
                            .addComponent(DF)
                            .addComponent(DD)
                            .addComponent(IDL, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EFF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AJ, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(DF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(IDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(RE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(IDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(NP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(RQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void deplace(int i)
    {
        try 
        {
            IDL.setText(model.getValueAt(i,0).toString());
            DD.setText(model.getValueAt(i,1).toString());
            DF.setText(model.getValueAt(i,2).toString());
            Pt.setText(model.getValueAt(i,3).toString());
            Pc.setText(model.getValueAt(i,4).toString());
            TA.setText(model.getValueAt(i,5).toString());
            IDC.setText(model.getValueAt(i,6).toString());
            RE.setText(model.getValueAt(i,7).toString());
            IDS.setText(model.getValueAt(i,8).toString());
            TR.setText(model.getValueAt(i,9).toString());
            NP.setText(model.getValueAt(i,10).toString());
            RQ.setText(model.getValueAt(i,11).toString());
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
            ResultSet Rs=st.executeQuery("Select * from locations");
            while(Rs.next())
            {
                model.addRow(new Object[]{Rs.getString("idlocation"),Rs.getString("date_debut"),Rs.getString("date_fin"),
                Rs.getString("prixht"),Rs.getString("prixttc"),Rs.getString("tva"),
                Rs.getString("idclients"),Rs.getString("remise"),Rs.getString("idsuccursale"),
                Rs.getString("tvaremise"),Rs.getString("netapayer"),Rs.getString("remarques")
                 });
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
       
    }
    
    private void IDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDLActionPerformed

    private void AJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AJActionPerformed
        // TODO add your handling code her
          String remarque=null;
        int idl=0,idc=0,ids=0,prixht=0,prixttc=0,netpayer=0,remise=0,tvarem=0;
                long tva=0;
        int debut=0,fin=0;
        Connection co=null;
        Statement st=null;
        try{
            
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch(Exception e){System.out.println("Erreur driver");}
        try{
            co=DriverManager.getConnection("jdbc:mysql://localhost/agence","root","");
            st=co.createStatement();
        }catch(Exception e){System.out.println("Erreur connexion");}
        if(IDL.getText().equals("")||DD.getText().equals("")||DF.getText().equals("")||Pt.getText().equals("")||Pc.getText().equals("")
                ||TA.getText().equals("")||IDC.getText().equals("")||RE.getText().equals("")||IDS.getText().equals("")||TR.getText().equals("")
                ||NP.getText().equals("")||RQ.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Remplir tous les champs");
        }
        else{
            if(JOptionPane.showConfirmDialog(null,"Voulez-vous enregistrer?","CONFIRMATION",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        try{
            remarque=RQ.getText();
            ids=Integer.parseInt(IDS.getText());idc=Integer.parseInt(IDC.getText());prixht=Integer.parseInt(Pt.getText());tvarem=Integer.parseInt(TR.getText());
            idl=Integer.parseInt(IDL.getText());remise=Integer.parseInt(RE.getText());prixttc=Integer.parseInt(Pc.getText());netpayer=Integer.parseInt(NP.getText());
            debut=Integer.parseInt(DD.getText());fin=Integer.parseInt(DF.getText());
            st.executeUpdate("insert into locations(idlocation,date_debut,date_fin,prixht,prixttc,tva,idclients,remise,idsuccursale,tvaremise,netapayer,remarques)"
                   +"values('"+idl+"','"+debut+"','"+fin+"','"+prixht+"','"+prixttc+"','"+tva+"','"+idc+"','"+remise+"','"+ids+"','"+tvarem+"','"+netpayer+"','"+remarque+"')");
            JOptionPane.showMessageDialog(null,"Données inserees");
            afficher();
        }catch(Exception e){System.out.println("Erreur Sql");}}
            else{
                JOptionPane.showMessageDialog(null,"Données non inserees");
            }
    }//GEN-LAST:event_AJActionPerformed
    }
    private void EFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EFFActionPerformed
        // TODO add your handling code here:
        IDL.setText("");DD.setText("");DF.setText("");Pt.setText("");Pc.setText("");TA.setText("");IDC.setText("");RE.setText("");
        IDS.setText("");TR.setText("");NP.setText("");RQ.setText("");
    }//GEN-LAST:event_EFFActionPerformed

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed
test_locations Loc=new test_locations();
            Loc.setVisible(true);

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
            java.util.logging.Logger.getLogger(Locations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Locations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Locations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Locations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Locations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AJ;
    private javax.swing.JTextField DD;
    private javax.swing.JTextField DF;
    private javax.swing.JButton EFF;
    private javax.swing.JTextField IDC;
    private javax.swing.JTextField IDL;
    private javax.swing.JTextField IDS;
    private javax.swing.JTextField NP;
    private javax.swing.JTextField Pc;
    private javax.swing.JTextField Pt;
    private javax.swing.JButton QT;
    private javax.swing.JTextField RE;
    private javax.swing.JTextField RQ;
    private javax.swing.JTextField TA;
    private javax.swing.JTextField TR;
    private javax.swing.JButton ar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
