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

        bQuitter = new javax.swing.JButton();
        bAjouterS = new javax.swing.JButton();
        bAfficherS = new javax.swing.JButton();
        bConsulGene = new javax.swing.JButton();
        bModifierS = new javax.swing.JButton();
        bConsulEtu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bQuitter.setText("Quitter");
        bQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitterActionPerformed(evt);
            }
        });

        bAjouterS.setText("Ajouter un sondage");
        bAjouterS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjouterSActionPerformed(evt);
            }
        });

        bAfficherS.setText("Afficher un sondage");
        bAfficherS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAfficherSActionPerformed(evt);
            }
        });

        bConsulGene.setText("Consultation générale d'un sondage");
        bConsulGene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsulGeneActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bQuitter))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bConsulEtu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAjouterS)
                            .addComponent(bModifierS))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(bConsulGene)
                                .addContainerGap(53, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bAfficherS)
                                .addGap(62, 62, 62))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAfficherS)
                    .addComponent(bAjouterS))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConsulGene)
                    .addComponent(bModifierS))
                .addGap(41, 41, 41)
                .addComponent(bConsulEtu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(bQuitter))
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
    // End of variables declaration//GEN-END:variables
}
