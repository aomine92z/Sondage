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
    
    private Site_sondage site;
    private List<String> reponse = new ArrayList<String>();
    private boolean anonyme;
    private boolean affichageTempsReel;
    private List<Question> Questions = new ArrayList<Question>(); //collection de questions du questionnaire
    private List<String> Participants = new ArrayList<String>(); 
    private List<Integer> Scores = new ArrayList<Integer>();
    private String nomSondage;
    private int compteurRep = 1; 
    private static S_MenuProf fichMenuProfConnecte;
    /**
     * Creates new form S_AjouterS
     */
    public S_AjouterS(java.awt.Frame parent, boolean modal, Site_sondage monSite, S_MenuProf menuProfConnecte) {
        super(parent, modal);
        initComponents();
        site = monSite;
        fichMenuProfConnecte = menuProfConnecte;
        
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
        jPanel1 = new javax.swing.JPanel();
        pQOuverte = new javax.swing.JPanel();
        pQCM = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tfQCM = new javax.swing.JTextField();
        tfAjoutRep = new javax.swing.JButton();
        bQCMSuivante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbAnoOui = new javax.swing.JRadioButton();
        rbAnoNon = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbAffOui = new javax.swing.JRadioButton();
        rbAffNon = new javax.swing.JRadioButton();
        tfParticipant = new javax.swing.JTextField();
        validerParticipant = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfNomS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        validerQuestionnaire = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfQO = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bQOSuivante = new javax.swing.JButton();
        bQuitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pQOuverte.setBackground(new java.awt.Color(220, 220, 253));

        pQCM.setBackground(new java.awt.Color(220, 220, 253));
        pQCM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QCM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        jLabel12.setText("Rentrez la question : ");

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
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12))
                    .addGroup(pQCMLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bQCMSuivante)
                            .addComponent(tfAjoutRep, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tfQCM, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pQCMLayout.setVerticalGroup(
            pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pQCMLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pQCMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pQCMLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bQCMSuivante)
                        .addGap(18, 18, 18)
                        .addComponent(tfAjoutRep))
                    .addComponent(tfQCM, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

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

        tfParticipant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfParticipantActionPerformed(evt);
            }
        });

        validerParticipant.setText("Valider");
        validerParticipant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerParticipantActionPerformed(evt);
            }
        });

        jLabel4.setText("Ajouter un participant :");

        jLabel1.setText("Nom du sondage :");

        tfNomS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomSActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Ajouter un sondage");

        validerQuestionnaire.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        validerQuestionnaire.setText("Valider et mettre fin au questionnaire");
        validerQuestionnaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerQuestionnaireActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(220, 220, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question Ouverte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        jLabel13.setText("Rentrez la question : ");

        bQOSuivante.setText("Question suivante");
        bQOSuivante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQOSuivanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bQOSuivante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(tfQO, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bQOSuivante))
                    .addComponent(tfQO, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        bQuitter.setText("Quitter");
        bQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pQOuverteLayout = new javax.swing.GroupLayout(pQOuverte);
        pQOuverte.setLayout(pQOuverteLayout);
        pQOuverteLayout.setHorizontalGroup(
            pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQOuverteLayout.createSequentialGroup()
                .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pQOuverteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(validerQuestionnaire)
                        .addGap(140, 140, 140)
                        .addComponent(bQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pQOuverteLayout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(pQOuverteLayout.createSequentialGroup()
                                    .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pQOuverteLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfNomS))
                                        .addGroup(pQOuverteLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(9, 9, 9)
                                            .addComponent(rbAffOui)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rbAffNon)))
                                    .addGap(76, 76, 76)
                                    .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pQOuverteLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(validerParticipant))
                                        .addGroup(pQOuverteLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbAnoOui)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rbAnoNon))))))
                        .addGroup(pQOuverteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(pQCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pQOuverteLayout.setVerticalGroup(
            pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQOuverteLayout.createSequentialGroup()
                .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pQOuverteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pQOuverteLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel3))
                            .addGroup(pQOuverteLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(rbAnoOui)
                                    .addComponent(rbAnoNon)
                                    .addComponent(tfNomS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbAffNon)
                                    .addComponent(rbAffOui)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pQOuverteLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(validerParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)))
                        .addComponent(pQCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(pQOuverteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pQOuverteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validerQuestionnaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pQOuverte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pQOuverte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pDebutSLayout = new javax.swing.GroupLayout(pDebutS);
        pDebutS.setLayout(pDebutSLayout);
        pDebutSLayout.setHorizontalGroup(
            pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDebutSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDebutSLayout.setVerticalGroup(
            pDebutSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDebutSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        fichMenuProfConnecte.setVisible(true);
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

    private void bQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        fichMenuProfConnecte.setVisible(true);
    }//GEN-LAST:event_bQuitterActionPerformed

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
                S_AjouterS dialog = new S_AjouterS(new javax.swing.JFrame(), true, S_Accueil.getSite(), fichMenuProfConnecte);
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
    private javax.swing.JButton bQuitter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
