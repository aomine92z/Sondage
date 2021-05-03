/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S_Fiches;

/**
 *
 * @author theobaptiste
 */
public class S_MenuProf extends javax.swing.JDialog {
    
    private S_AfficherS fichAfficherS;
    private S_ModifierS fichModifierS;
    private S_AjouterS fichAjouterS;
    private S_ConsulEtu fichConsulEtu;
    private S_ConsulGene fichConsulGene;

       
    /**
     * Creates new form S_MenuProf
     */
    public S_MenuProf(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fichAfficherS = new S_AfficherS(parent, false);
        fichModifierS = new S_ModifierS(parent, false); 
        fichAjouterS = new S_AjouterS(parent, false);
        fichConsulEtu = new S_ConsulEtu(parent, false); 
        fichConsulGene = new S_ConsulGene(parent, false);
                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bAjouterS = new javax.swing.JButton();
        bModifierS = new javax.swing.JButton();
        bConsulEtu = new javax.swing.JButton();
        bConsulGene = new javax.swing.JButton();
        bAfficherS = new javax.swing.JButton();
        bQuitter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 220, 253));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Menu des enseignants");

        bAjouterS.setText("Ajouter un sondage");
        bAjouterS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjouterSActionPerformed(evt);
            }
        });

        bModifierS.setText("Modifier un sondage");
        bModifierS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifierSActionPerformed(evt);
            }
        });

        bConsulEtu.setText("Consultation des réponses d'un étudiant ");
        bConsulEtu.setToolTipText("");
        bConsulEtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsulEtuActionPerformed(evt);
            }
        });

        bConsulGene.setText("Consultation générale d'un sondage");
        bConsulGene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsulGeneActionPerformed(evt);
            }
        });

        bAfficherS.setText("Afficher un sondage");
        bAfficherS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAfficherSActionPerformed(evt);
            }
        });

        bQuitter.setText("Quitter");
        bQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitterActionPerformed(evt);
            }
        });

        jLabel2.setText("Que voullez vous réalisez");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bModifierS)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(166, 166, 166)
                        .addComponent(bAjouterS))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bConsulGene))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bConsulEtu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAfficherS)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bQuitter)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bModifierS)
                            .addComponent(bConsulGene))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bConsulEtu)
                            .addComponent(bAfficherS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(bQuitter))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bAjouterS)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAjouterSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjouterSActionPerformed
        this.setVisible(false);
        fichAjouterS.setVisible(true);     
    }//GEN-LAST:event_bAjouterSActionPerformed

    private void bConsulGeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsulGeneActionPerformed
        this.setVisible(false);
        fichConsulGene.setVisible(true);     
    }//GEN-LAST:event_bConsulGeneActionPerformed

    private void bQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitterActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(true);//=fiche d'acceuil:
    }//GEN-LAST:event_bQuitterActionPerformed

    private void bAfficherSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAfficherSActionPerformed
        this.setVisible(false);
        fichAfficherS.setVisible(true);     
    }//GEN-LAST:event_bAfficherSActionPerformed

    private void bModifierSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifierSActionPerformed
        this.setVisible(false);
        fichModifierS.setVisible(true);     
    }//GEN-LAST:event_bModifierSActionPerformed

    private void bConsulEtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsulEtuActionPerformed
        this.setVisible(false);
        fichConsulEtu.setVisible(true);     
    }//GEN-LAST:event_bConsulEtuActionPerformed

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
            java.util.logging.Logger.getLogger(S_MenuProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_MenuProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_MenuProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_MenuProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                S_MenuProf dialog = new S_MenuProf(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAfficherS;
    private javax.swing.JButton bAjouterS;
    private javax.swing.JButton bConsulEtu;
    private javax.swing.JButton bConsulGene;
    private javax.swing.JButton bModifierS;
    private javax.swing.JButton bQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
