/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S_Fiches;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sondage.Openquestion;
import sondage.Qcm;
import sondage.Question;
import sondage.Questionnaire;
import sondage.Site_sondage;
import sondage.Teacher;

/**
 *
 * @author theobaptiste
 */
public class S_AfficherS extends javax.swing.JDialog {

    /**
     * Creates new form S_AfficherS
     */
    private Site_sondage site;
    private String nomSondageAffiche;
    private List<String> Participants = new ArrayList<String>(); 
    private List<Integer> Scores = new ArrayList<Integer>();
    private List<String> reponse = new ArrayList<String>();
    private List<Question> questions = new ArrayList<Question>();
    private int compteurQuest = 1;
    
    public S_AfficherS(java.awt.Frame parent, boolean modal, Site_sondage monSite) {
        super(parent, modal);
        initComponents();
        site = monSite;
        jScrollBar1.setVisible(false);
        jLabAffichageNomS.setVisible(false);
        jLabel1.setVisible(false);
        jLabNomProfRespo.setVisible(false);
        jLabNumQuestion.setVisible(false);
        jLabel2.setVisible(false);
        jLabTypeQuestion.setVisible(false);
        jLabIntituleQuest.setVisible(false);
        jLabTypeQuestion.setVisible(false);
        bAfficherReponseQcm.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        tfNomSondageAffiche = new javax.swing.JTextField();
        jLabGetNomSondageAffiche = new javax.swing.JLabel();
        validerNomSondageAffiche = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabAffichageNomS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabNomProfRespo = new javax.swing.JLabel();
        jLabIntituleQuest = new javax.swing.JLabel();
        jLabNumQuestion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabTypeQuestion = new javax.swing.JLabel();
        bAfficherReponseQcm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabReponse = new javax.swing.JTable();
        bQuestionSuivante = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(220, 220, 253));

        tfNomSondageAffiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomSondageAfficheActionPerformed(evt);
            }
        });

        jLabGetNomSondageAffiche.setText("Entrez le nom du sondage à afficher :");
        jLabGetNomSondageAffiche.setOpaque(true);

        validerNomSondageAffiche.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        validerNomSondageAffiche.setText("✓");
        validerNomSondageAffiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerNomSondageAfficheActionPerformed(evt);
            }
        });

        jLabAffichageNomS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabAffichageNomS.setOpaque(true);

        jLabel1.setText("Professeur responsable du sondage :");
        jLabel1.setOpaque(true);

        jLabNomProfRespo.setText("     ");
        jLabNomProfRespo.setOpaque(true);

        jLabIntituleQuest.setText("    ");
        jLabIntituleQuest.setOpaque(true);

        jLabNumQuestion.setText("  ");
        jLabNumQuestion.setOpaque(true);

        jLabel2.setText("     Type de la question :");
        jLabel2.setOpaque(true);

        jLabTypeQuestion.setText("  ");
        jLabTypeQuestion.setOpaque(true);

        bAfficherReponseQcm.setText("Appuyer ici pour visualiser les réponses prédéfinies");
        bAfficherReponseQcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAfficherReponseQcmActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTabReponse);

        bQuestionSuivante.setText("Appuyer ici pour afficher la question suivante du sondage");
        bQuestionSuivante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuestionSuivanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabGetNomSondageAffiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfNomSondageAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validerNomSondageAffiche)))
                        .addGap(227, 227, 227))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabNumQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabIntituleQuest, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(jLabAffichageNomS, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabNomProfRespo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabTypeQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(bAfficherReponseQcm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bQuestionSuivante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabGetNomSondageAffiche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(validerNomSondageAffiche)
                            .addComponent(tfNomSondageAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabAffichageNomS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabNomProfRespo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabIntituleQuest, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jLabNumQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jLabTypeQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bAfficherReponseQcm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bQuestionSuivante)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 477, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerNomSondageModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerNomSondageModifActionPerformed

    }//GEN-LAST:event_validerNomSondageModifActionPerformed

    private void validerNomSondageAfficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerNomSondageAfficheActionPerformed
        // TODO add your handling code here:
        nomSondageAffiche = tfNomSondageAffiche.getText();
        if (site.searchSondage(S_ConnexionEns.getProfConnecte().getMail(), nomSondageAffiche)==null){
            JOptionPane.showMessageDialog(this, "Le nom rentré ne correspond à aucun sondage", "Erreur introuvable", WIDTH);   
        }
        else{
            tfNomSondageAffiche.setVisible(false);
            validerNomSondageAffiche.setVisible(false);
            jLabGetNomSondageAffiche.setVisible(false);
            jScrollBar1.setVisible(true);
            jLabAffichageNomS.setText(nomSondageAffiche);
            jLabAffichageNomS.setVisible(true);
            jLabel1.setVisible(true);
            jLabNomProfRespo.setText(S_ConnexionEns.getProfConnecte().getMail());
            jLabNomProfRespo.setVisible(true);
            jLabNumQuestion.setText("Question numéro 1 : ");
            jLabNumQuestion.setVisible(true);
            jLabel2.setVisible(true);
            jLabTypeQuestion.setVisible(true);
            
            questions = site.searchSondage(S_ConnexionEns.getProfConnecte().getMail(), nomSondageAffiche).getListeQuestion();
            for (int i=0; i<1; i++){
                if (questions.get(i).getClass()==Openquestion.class){
                    jLabIntituleQuest.setText(questions.get(i).getIntituleQuest());
                    jLabTypeQuestion.setText("Question à réponse ouverte");    
                }
                else if (questions.get(i).getClass()==Qcm.class){
//                    String[] tabDesRep = new String[questions.get(i).getListRep().size()];
//                    int[] tabDesScores = new int[questions.get(i).getScore().size()];
                    jLabIntituleQuest.setText(questions.get(i).getIntituleQuest());
                    jLabTypeQuestion.setText("Question à reponses prédéfinies");
                    bAfficherReponseQcm.setVisible(true);
//                    for (int j=0; j<questions.get(i).getListRep().size(); j++){
//                        tabDesRep[j] = questions.get(i).getListRep().get(j);
//                        tabDesScores[j] = questions.get(i).getScore().get(j);
//                    }
//                    JTable reponseAffiche = new JTable (tabDesRep, tabDesScores);
                }
            }
            
            jLabIntituleQuest.setVisible(true);
            jLabTypeQuestion.setVisible(true);
        }
        tfNomSondageAffiche.setText(null);
    }//GEN-LAST:event_validerNomSondageAfficheActionPerformed

    private void tfNomSondageAfficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomSondageAfficheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomSondageAfficheActionPerformed

    private void bAfficherReponseQcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAfficherReponseQcmActionPerformed
        // TODO add your handling code here:
        for (int i=0; i<questions.get(compteurQuest).getListRep().size(); i++){
            jTabReponse.add(questions.get(compteurQuest).getListRep().get(i), this.jTabReponse);
//            this.jTabReponse.;
        }
        
    }//GEN-LAST:event_bAfficherReponseQcmActionPerformed

    private void bQuestionSuivanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuestionSuivanteActionPerformed
        // TODO add your handling code here:
        if (questions.get(compteurQuest).getClass()==Openquestion.class){
                    jLabIntituleQuest.setText(questions.get(compteurQuest).getIntituleQuest());
                    jLabTypeQuestion.setText("Question à réponse ouverte");  
                    bAfficherReponseQcm.setVisible(false);
                }
        else if (questions.get(compteurQuest).getClass()==Qcm.class){
                    jLabIntituleQuest.setText(questions.get(compteurQuest).getIntituleQuest());
                    jLabTypeQuestion.setText("Question à reponses prédéfinies");
                    bAfficherReponseQcm.setVisible(true);
                }
        compteurQuest+=1;
        
    }//GEN-LAST:event_bQuestionSuivanteActionPerformed

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
            java.util.logging.Logger.getLogger(S_AfficherS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_AfficherS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_AfficherS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_AfficherS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                S_AfficherS dialog = new S_AfficherS(new javax.swing.JFrame(), true, S_Accueil.getSite());
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
    private javax.swing.JButton bAfficherReponseQcm;
    private javax.swing.JButton bQuestionSuivante;
    private javax.swing.JLabel jLabAffichageNomS;
    private javax.swing.JLabel jLabGetNomSondageAffiche;
    private javax.swing.JLabel jLabIntituleQuest;
    private javax.swing.JLabel jLabNomProfRespo;
    private javax.swing.JLabel jLabNumQuestion;
    private javax.swing.JLabel jLabTypeQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabReponse;
    private javax.swing.JTextField tfNomSondageAffiche;
    private javax.swing.JButton validerNomSondageAffiche;
    // End of variables declaration//GEN-END:variables
}
