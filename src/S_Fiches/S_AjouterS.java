/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S_Fiches;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import sondage.Openquestion;
import sondage.Qcm;
import sondage.Question;
import sondage.Questionnaire;
import sondage.Reponse;
import sondage.Site_sondage;
import sondage.Teacher;

/**
 *
 * @author theobaptiste
 */
public class S_AjouterS extends javax.swing.JDialog {
    
//    private S_MenuProf fichMenuProf2;
    private Site_sondage site;
    private List<String> reponse = new ArrayList<String>();
    private boolean anonyme;
    private boolean affichageTempsReel;
    private List<Question> Questions = new ArrayList<Question>(); //collection de questions du questionnaire
    private List<String> Participants = new ArrayList<String>(); 
    private List<Integer> Scores = new ArrayList<Integer>();
    private String nomSondage;
    private int compteurRep = 1; 

    /**
     * Creates new form S_AjouterS
     */
    public S_AjouterS(java.awt.Frame parent, boolean modal, Site_sondage monSite) {
        super(parent, modal);
        initComponents();
        site = monSite;
//        fichMenuProf2 = new S_MenuProf(parent, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        pDebutS = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbAnoOui = new javax.swing.JRadioButton();
        rbAnoNon = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        tfNomS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbAffOui = new javax.swing.JRadioButton();
        rbAffNon = new javax.swing.JRadioButton();
        pQCM = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfQCM = new javax.swing.JTextField();
        pQOuverte = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tfQO = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bQOSuivante = new javax.swing.JButton();
        tfAjoutRep = new javax.swing.JButton();
        bQCMSuivante = new javax.swing.JButton();
        validerQuestionnaire = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        validerParticipant = new javax.swing.JButton();
        tfParticipant = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Participation anonyme ?");

        buttonGroup1.add(rbAnoOui);
        rbAnoOui.setText("Oui");
        rbAnoOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAnoOuiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAnoNon);
        rbAnoNon.setText("Non");
        rbAnoNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAnoNonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom du sondage :");

        tfNomS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomSActionPerformed(evt);
            }
        });

        jLabel3.setText("Affichage en temps réel ?");

        buttonGroup2.add(rbAffOui);
        rbAffOui.setText("Oui");
        rbAffOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAffOuiActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbAffNon);
        rbAffNon.setText("Non");
        rbAffNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAffNonActionPerformed(evt);
            }
        });

        jLabel11.setText("QCM");

        jLabel12.setText("Rentrez la question : ");

        jLabel13.setText("Rentrez la question : ");

        jLabel14.setText("Question Ouverte");

        bQOSuivante.setText("Question suivante");
        bQOSuivante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQOSuivanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pQOuverteLayout = new javax.swing.GroupLayout(pQOuverte);
        pQOuverte.setLayout(pQOuverteLayout);
        pQOuverteLayout.setHorizontalGroup(
            pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQOuverteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfQO, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pQOuverteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pQOuverteLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pQOuverteLayout.createSequentialGroup()
                        .addComponent(bQOSuivante)
                        .addGap(55, 55, 55))))
        );
        pQOuverteLayout.setVerticalGroup(
            pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQOuverteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQO, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(bQOSuivante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tfAjoutRep.setText("Ajouter une réponse");
        tfAjoutRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAjoutRepActionPerformed(evt);
            }
        });

        bQCMSuivante.setText("Question Suivante");
        bQCMSuivante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQCMSuivanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pQCMLayout = new javax.swing.GroupLayout(pQCM);
        pQCM.setLayout(pQCMLayout);
        pQCMLayout.setHorizontalGroup(
            pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQCMLayout.createSequentialGroup()
                .addGroup(pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pQCMLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(101, 101, 101))
                    .addGroup(pQCMLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfQCM, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pQCMLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pQCMLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(bQCMSuivante))
                                    .addComponent(tfAjoutRep, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(pQOuverte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        pQCMLayout.setVerticalGroup(
            pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pQCMLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQCM, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAjoutRep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bQCMSuivante)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(pQOuverte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        validerQuestionnaire.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        validerQuestionnaire.setText("Valider et mettre fin au questionnaire");
        validerQuestionnaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerQuestionnaireActionPerformed(evt);
            }
        });

        jLabel4.setText("Ajouter un participant :");

        validerParticipant.setText("Valider");
        validerParticipant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerParticipantActionPerformed(evt);
            }
        });

        tfParticipant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfParticipantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDebutSLayout = new javax.swing.GroupLayout(pDebutS);
        pDebutS.setLayout(pDebutSLayout);
        pDebutSLayout.setHorizontalGroup(
            pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDebutSLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDebutSLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDebutSLayout.createSequentialGroup()
                                .addComponent(rbAffOui)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pDebutSLayout.createSequentialGroup()
                                .addComponent(rbAffNon)
                                .addGap(94, 526, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDebutSLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDebutSLayout.createSequentialGroup()
                                .addComponent(rbAnoOui)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pDebutSLayout.createSequentialGroup()
                                .addComponent(rbAnoNon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(163, 163, 163))))
                    .addGroup(pDebutSLayout.createSequentialGroup()
                        .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pQCM, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDebutSLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfNomS, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDebutSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validerQuestionnaire)
                    .addGroup(pDebutSLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(tfParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(validerParticipant)))
                .addGap(38, 38, 38))
        );
        pDebutSLayout.setVerticalGroup(
            pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDebutSLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNomS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbAnoOui))
                .addGap(3, 3, 3)
                .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDebutSLayout.createSequentialGroup()
                        .addComponent(rbAnoNon)
                        .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDebutSLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDebutSLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(validerParticipant)
                                    .addComponent(tfParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(rbAffOui)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAffNon)
                        .addGap(38, 38, 38)
                        .addComponent(pQCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(validerQuestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(pDebutSLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDebutS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDebutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbAnoOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAnoOuiActionPerformed
        anonyme = true;
    }//GEN-LAST:event_rbAnoOuiActionPerformed

    private void bQCMSuivanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQCMSuivanteActionPerformed
        // la faut que tu utilise les text field et button groupe pour enregistrer le qcm quelque part 
        String Question = tfQCM.getText();
        Qcm nouvQcm = new Qcm (Question, reponse, Scores);
        Questions.add(nouvQcm);
        tfQCM.setText("         ");
    }//GEN-LAST:event_bQCMSuivanteActionPerformed

    private void bQOSuivanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQOSuivanteActionPerformed
        String Question = tfQO.getText();
        Openquestion nouvOpenQ = new Openquestion (Question);
        Questions.add(nouvOpenQ);
        tfQO.setText("        ");
    }//GEN-LAST:event_bQOSuivanteActionPerformed

    private void validerQuestionnaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerQuestionnaireActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
        int CodeSondage = rand.nextInt(90000) + 10000;
        Questionnaire nouveauSondage = new Questionnaire (nomSondage, S_ConnexionEns.getProfConnecte(), Questions, Participants, anonyme, affichageTempsReel, CodeSondage);
        site.ajouterSondage(nouveauSondage);
        JOptionPane.showInputDialog(this, "CODE DU SONDAGE", CodeSondage);
        this.setVisible(false);
//        fichMenuProf2.setVisible(true);
    }//GEN-LAST:event_validerQuestionnaireActionPerformed

    private void tfAjoutRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAjoutRepActionPerformed
        // TODO add your handling code here:
        String RepAjoutee = JOptionPane.showInputDialog(this, "Rentrez une reponse possible.","Réponse numéro "+ compteurRep,JOptionPane.QUESTION_MESSAGE);
        compteurRep+=1;
        reponse.add(RepAjoutee);
        Scores.add(0);
    }//GEN-LAST:event_tfAjoutRepActionPerformed

    private void rbAnoNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAnoNonActionPerformed
        anonyme = false;
    }//GEN-LAST:event_rbAnoNonActionPerformed

    private void rbAffOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAffOuiActionPerformed
        // TODO add your handling code here:
        affichageTempsReel = true;
    }//GEN-LAST:event_rbAffOuiActionPerformed

    private void rbAffNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAffNonActionPerformed
        // TODO add your handling code here:
        affichageTempsReel = false;
    }//GEN-LAST:event_rbAffNonActionPerformed

    private void tfNomSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomSActionPerformed
        // TODO add your handling code here:
        nomSondage = tfNomS.getText();
    }//GEN-LAST:event_tfNomSActionPerformed

    private void tfParticipantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfParticipantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfParticipantActionPerformed

    private void validerParticipantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerParticipantActionPerformed
        // TODO add your handling code here:
        String participantSondage = tfParticipant.getText();
        Participants.add(participantSondage);
        tfParticipant.setText(null);
    }//GEN-LAST:event_validerParticipantActionPerformed

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
            java.util.logging.Logger.getLogger(S_AjouterS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_AjouterS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_AjouterS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_AjouterS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                S_AjouterS dialog = new S_AjouterS(new javax.swing.JFrame(), true, S_Accueil.getSite());
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
    private javax.swing.JButton bQCMSuivante;
    private javax.swing.JButton bQOSuivante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pDebutS;
    private javax.swing.JPanel pQCM;
    private javax.swing.JPanel pQOuverte;
    private javax.swing.JRadioButton rbAffNon;
    private javax.swing.JRadioButton rbAffOui;
    private javax.swing.JRadioButton rbAnoNon;
    private javax.swing.JRadioButton rbAnoOui;
    private javax.swing.JButton tfAjoutRep;
    private javax.swing.JTextField tfNomS;
    private javax.swing.JTextField tfParticipant;
    private javax.swing.JTextField tfQCM;
    private javax.swing.JTextField tfQO;
    private javax.swing.JButton validerParticipant;
    private javax.swing.JButton validerQuestionnaire;
    // End of variables declaration//GEN-END:variables
}
