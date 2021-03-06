/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S_Fiches;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sondage.Questionnaire;
import sondage.Site_sondage;

/**
 *
 * @author theobaptiste
 */
public class S_ModifierS extends javax.swing.JDialog {

    /**
     * Creates new form S_ModifierS
     */
    private int compteurRep = 1;
    private List<String> reponse = new ArrayList<String>();
    private Site_sondage site;
    private String nomSondageModif;
    private List<String> Participants = new ArrayList<String>(); 
    private List<Integer> Scores = new ArrayList<Integer>();
    private static S_MenuProf fichMenuProfConnecte;
    
    public S_ModifierS(java.awt.Frame parent, boolean modal, Site_sondage monSite, S_MenuProf menuProfConnecte) {
        super(parent, modal);
        initComponents();
        site = monSite;
        fichMenuProfConnecte = menuProfConnecte;
        jLabAjoutQcm.setVisible(false);
        jLabAjoutQO.setVisible(false);
        jLabAjoutParticipant.setVisible(false);
        jLabModifNom.setVisible(false);
        bSuppSondage.setVisible(false);
        tfAjoutQO.setVisible(false);
        tfAjoutQcm.setVisible(false);
        tfAjouterParticipant.setVisible(false);
        tfNewN.setVisible(false);
        validerAjoutParticipant.setVisible(false);
        validerAjoutQCM1.setVisible(false);
        validerAjoutQO.setVisible(false);
        validerChangementNom.setVisible(false);
        bFinModifSondage.setVisible(false);
        bAjoutRep.setVisible(false);
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
        jLabAjoutQO = new javax.swing.JLabel();
        tfAjoutQO = new javax.swing.JTextField();
        validerAjoutQO = new javax.swing.JButton();
        jLabAjoutQcm = new javax.swing.JLabel();
        tfAjoutQcm = new javax.swing.JTextField();
        validerAjoutQCM1 = new javax.swing.JButton();
        bAjoutRep = new javax.swing.JButton();
        bFinModifSondage = new javax.swing.JToggleButton();
        tfNewN = new javax.swing.JTextField();
        jLabModifNom = new javax.swing.JLabel();
        validerChangementNom = new javax.swing.JButton();
        tfAjouterParticipant = new javax.swing.JTextField();
        jLabAjoutParticipant = new javax.swing.JLabel();
        validerAjoutParticipant = new javax.swing.JButton();
        tfNomSondageModif = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        validerNomSondageModif = new javax.swing.JButton();
        bSuppSondage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bQuitter2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 220, 253));

        jLabAjoutQO.setText("Ajouter une question ouverte");

        validerAjoutQO.setText("???");
        validerAjoutQO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerAjoutQOActionPerformed(evt);
            }
        });

        jLabAjoutQcm.setText("Ajouter un QCM");

        validerAjoutQCM1.setText("???");
        validerAjoutQCM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerAjoutQCM1ActionPerformed(evt);
            }
        });

        bAjoutRep.setText("Ajouter une r??ponse");
        bAjoutRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjoutRepActionPerformed(evt);
            }
        });

        bFinModifSondage.setText("Mettre fin ?? la modification du sondage");
        bFinModifSondage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFinModifSondageActionPerformed(evt);
            }
        });

        jLabModifNom.setText("Modifier le nom du sondage");

        validerChangementNom.setText("???");
        validerChangementNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerChangementNomActionPerformed(evt);
            }
        });

        jLabAjoutParticipant.setText("Ajouter un participant");

        validerAjoutParticipant.setText("???");
        validerAjoutParticipant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerAjoutParticipantActionPerformed(evt);
            }
        });

        jLabel1.setText("Veuillez entrer le nom du sondage ?? modifier :");

        validerNomSondageModif.setText("Valider");
        validerNomSondageModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerNomSondageModifActionPerformed(evt);
            }
        });

        bSuppSondage.setText("Supprimer le sondage");
        bSuppSondage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSuppSondageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Modifier sondage");

        bQuitter2.setText("Quitter");
        bQuitter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitter2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(bAjoutRep, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validerAjoutQCM1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(bFinModifSondage, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabAjoutQcm)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfNomSondageModif, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(validerNomSondageModif))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfNewN, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(validerChangementNom))
                                    .addComponent(jLabModifNom)
                                    .addComponent(tfAjoutQcm, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validerAjoutParticipant))
                            .addComponent(validerAjoutQO))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabAjoutParticipant)
                            .addComponent(tfAjouterParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabAjoutQO)
                            .addComponent(tfAjoutQO, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bQuitter2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSuppSondage)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSuppSondage)
                            .addComponent(bQuitter2))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfNomSondageModif, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(validerNomSondageModif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabAjoutParticipant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabModifNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNewN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validerChangementNom)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(validerAjoutParticipant)
                        .addComponent(tfAjouterParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabAjoutQcm)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabAjoutQO)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfAjoutQO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validerAjoutQO))
                        .addComponent(tfAjoutQcm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAjoutRep)
                            .addComponent(validerAjoutQCM1)
                            .addComponent(bFinModifSondage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 36, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerNomSondageModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerNomSondageModifActionPerformed
        // TODO add your handling code here:
        nomSondageModif = tfNomSondageModif.getText();
        Questionnaire sondageAmodifier = site.searchSondage(S_ConnexionEns.getProfConnecte().getMail(), nomSondageModif);
        if (sondageAmodifier == null){
            JOptionPane.showMessageDialog(this, "Le nom rentr?? ne correspond ?? aucun sondage", "Erreur introuvable", WIDTH);
        }
        else {
            jLabAjoutQcm.setVisible(true);
            jLabAjoutQO.setVisible(true);
            jLabAjoutParticipant.setVisible(true);
            jLabModifNom.setVisible(true);
            bSuppSondage.setVisible(true);
            tfAjoutQO.setVisible(true);
            tfAjoutQcm.setVisible(true);
            tfAjouterParticipant.setVisible(true);
            tfNewN.setVisible(true);
            validerAjoutParticipant.setVisible(true);
            validerAjoutQCM1.setVisible(true);
            validerAjoutQO.setVisible(true);
            validerChangementNom.setVisible(true);
            bFinModifSondage.setVisible(true);
            bAjoutRep.setVisible(true);
        }
    }//GEN-LAST:event_validerNomSondageModifActionPerformed

    private void validerChangementNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerChangementNomActionPerformed
        // TODO add your handling code here:
        String nouveauNom = tfNewN.getText();
        site.searchSondage(S_ConnexionEns.getProfConnecte().getMail(), nomSondageModif).setName(nouveauNom);
        nomSondageModif = nouveauNom;
        tfNewN.setText(null);
        
    }//GEN-LAST:event_validerChangementNomActionPerformed

    private void validerAjoutParticipantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerAjoutParticipantActionPerformed
        // TODO add your handling code here:
        String nouveauParticipant = tfAjouterParticipant.getText();
        site.searchSondage(S_ConnexionEns.getProfConnecte().getMail(), nomSondageModif).ajouterParticipant(nouveauParticipant);
        tfAjouterParticipant.setText(null);
    }//GEN-LAST:event_validerAjoutParticipantActionPerformed

    private void bSuppSondageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSuppSondageActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(this, "ATTENTION", "??tes-vous s??r de vouloir supprimer ce sondage ?", WIDTH);
        if (confirmation==0){
            site.supprimerSondage(site.searchSondage(S_ConnexionEns.getProfConnecte().getMail(), nomSondageModif));
            JOptionPane.showMessageDialog(this, "Le sondage a ??t?? supprim?? avec succ??s.");
        }
    }//GEN-LAST:event_bSuppSondageActionPerformed

    private void validerAjoutQOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerAjoutQOActionPerformed
        // TODO add your handling code here:
        String questionOuverteAjoutee = tfAjoutQO.getText();
        site.searchSondage(S_ConnexionEns.getProfConnecte().getMail(), nomSondageModif).ajouterOpenQuest(questionOuverteAjoutee);
        tfAjoutQO.setText(null);
    }//GEN-LAST:event_validerAjoutQOActionPerformed

    private void validerAjoutQCM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerAjoutQCM1ActionPerformed
        // TODO add your handling code here:
        String QcmAjoutee = tfAjoutQcm.getText(); 
        site.searchSondage(S_ConnexionEns.getProfConnecte().getMail(), nomSondageModif).ajouterQcm(QcmAjoutee, reponse, Scores);
        tfAjoutQcm.setText(null);
    }//GEN-LAST:event_validerAjoutQCM1ActionPerformed

    private void bAjoutRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjoutRepActionPerformed
        // TODO add your handling code here:
        String RepAjoutee = JOptionPane.showInputDialog(this, "Rentrez une reponse possible.","R??ponse num??ro "+ compteurRep,JOptionPane.QUESTION_MESSAGE);
        compteurRep+=1;
        reponse.add(RepAjoutee);
        Scores.add(0);
    }//GEN-LAST:event_bAjoutRepActionPerformed

    private void bFinModifSondageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFinModifSondageActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        fichMenuProfConnecte.setVisible(true); 
    }//GEN-LAST:event_bFinModifSondageActionPerformed

    private void bQuitter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitter2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        fichMenuProfConnecte.setVisible(true);
    }//GEN-LAST:event_bQuitter2ActionPerformed

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
            java.util.logging.Logger.getLogger(S_ModifierS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_ModifierS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_ModifierS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_ModifierS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                S_ModifierS dialog = new S_ModifierS(new javax.swing.JFrame(), true, S_Accueil.getSite(), fichMenuProfConnecte);
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
    private javax.swing.JButton bAjoutRep;
    private javax.swing.JToggleButton bFinModifSondage;
    private javax.swing.JButton bQuitter;
    private javax.swing.JButton bQuitter1;
    private javax.swing.JButton bQuitter2;
    private javax.swing.JButton bSuppSondage;
    private javax.swing.JLabel jLabAjoutParticipant;
    private javax.swing.JLabel jLabAjoutQO;
    private javax.swing.JLabel jLabAjoutQcm;
    private javax.swing.JLabel jLabModifNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAjoutQO;
    private javax.swing.JTextField tfAjoutQcm;
    private javax.swing.JTextField tfAjouterParticipant;
    private javax.swing.JTextField tfNewN;
    private javax.swing.JTextField tfNomSondageModif;
    private javax.swing.JButton validerAjoutParticipant;
    private javax.swing.JButton validerAjoutQCM1;
    private javax.swing.JButton validerAjoutQO;
    private javax.swing.JButton validerChangementNom;
    private javax.swing.JButton validerNomSondageModif;
    // End of variables declaration//GEN-END:variables
}
