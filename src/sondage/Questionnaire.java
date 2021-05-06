/*
classe qui regroupe les différents sondages
 */
package sondage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Amine
 */
public class Questionnaire {
    
    
    // attributs
    private String name; //nom du questionnaire
    private int code; //code du questionnairre
    private Teacher teacherRespo; // enseignant responsable du questionnaire
    private List<Question> Questions = new ArrayList<Question>(); //collection de questions du questionnaire
    private List<String> Participants = new ArrayList<String>(); //liste des participants au questionnaire
    private boolean anonyme; //participation au questionnaire anonyme ou authentifiée
    private boolean affichageResultats; //affichage des résultats en temps réel ou non
    
    private List<Reponse> Reponses; // liste pour les réponses


        
    // constructeur
    public Questionnaire (String valName, Teacher valTeacher, List<Question> valQuestions, List<String> valParticipants, boolean valAnonyme, boolean valAffichageResultats, int valCode){
        this.name = valName;
        this.teacherRespo = valTeacher;
        this.Questions = valQuestions;
        this.Participants = valParticipants;
        this.anonyme = valAnonyme;
        this.affichageResultats = valAffichageResultats;
        this.code = valCode;            
        
        this.Reponses = new <Reponse> ArrayList();
    }
    
    // autres méthodes 
    
    // méthode pour récupérer le nom du sondage
    public String getName(){
        return this.name;
    }
    
    // méthode pour récupérer les questions d'un sondage
    public List<Question> getListeQuestion(){
        return Questions;
    }
    
    // méthode pour récupérer les participants d'un sondage
    public List<String> getListeParticipants(){
        return Participants;
    }
    
    // méthode pour récupérer l'enseignant responsable d'un sondage
    public Teacher getTeacher(){
        return this.teacherRespo;
    }
    
    //méthode pour récupérer l'anonymat du sondage
    public boolean getAnonyme(){
        return anonyme;
    }
   
    //méthode pour récupérer la valeur de l'affichage en temps réel du sondage
    public boolean getAffichageTempsReel(){
        return affichageResultats;
    }
    
    // méthode pour récupérer le code d'un sondage
    public int getCode(){
        return this.code;
    }
    
    // méthode pour établir un nouveau nom de sondage
    public void setName(String valoName){
        this.name = valoName;
    }
    
    // méthode pour ajouter une question ouverte lors de la modif d'un sondage
    public void ajouterOpenQuest(String intituleQO) {
        Openquestion QOajoutee = new Openquestion (intituleQO);
        this.Questions.add(QOajoutee);
    }
    
    // méthode pour ajouter un qcm lors de la modif d'un sondage
    public void ajouterQcm (String intituleQcm, List <String> listReponses, List <Integer> scorito){
        Qcm QCMajoutee = new Qcm (intituleQcm, listReponses, scorito);
        this.Questions.add(QCMajoutee);
    }
    
    // méthode pour ajouter des participants à la liste de participants
    public void ajouterParticipant(String nomParticipant) {
        this.Participants.add(nomParticipant);
    }
    
    public void lancerQuestionnaire(){
        
        System.out.println(name); // affiche le nom du sondage
        System.out.println(teacherRespo.getMail()); // affiche le nom du professeur responsable du sondage
        Student eleveConnecte; // création d"un étudiant
        
        // Si la particpation n'est pas anonyme l'éève doit renseigner son mail
        if (anonyme==false){
            System.out.println("La partcipation à ce sondage n'est pas anonyme.\nVeuillez rensiegner votre adresse mail étudiante : ");
            Scanner sc2 = new Scanner(System.in);
            String mailStud = sc2.nextLine();
            
            eleveConnecte = new Student(mailStud);
            // création d'un élève connu
        }  
        
        // Sinon il ne donne rien sur lui
        else{
            eleveConnecte = new Student("Anonyme");
            //création d'un élève anonyme
        }
        
        // affichage des questions du sondage pour que l'élève puisse y répondre
        for (int i=0; i<Questions.size(); i++){
            Questions.get(i).AfficherQuest();
            
            // si la question correspond à un QCM
            if (Questions.get(i).getClass().equals(Qcm.class)){
                System.out.println("Séléctionnez une réponse en entrant le chiffre lui correspondant : ");
                Scanner sc3 = new Scanner(System.in);
                int indiceRepChoisie = sc3.nextInt();
                
                // on crée une nouvelle réponse  selon ce que l'élève a répondu
                Reponse repChoisie = new Reponse(i, indiceRepChoisie, eleveConnecte);
                Reponses.add(repChoisie); // ajout de cette réponse à la liste de réponses
                Questions.get(i).ajouterScore(indiceRepChoisie); // on augmente de 1 le score pour la réponse donnée
            }
            
            // si la question correspond à une question ouverte
            if (Questions.get(i).getClass().equals(Openquestion.class)){
                System.out.println("Veuillez entrer une réponse avec vos propres mots : ");
                Scanner sc4 = new Scanner(System.in);
                String answer = sc4.nextLine(); // l'élève saisit une reponse ouverte
                
                // création de la réponse ouverte selon l'entrée de l'élève
                Openreponse repOuverte = new Openreponse(i, eleveConnecte, answer);
                Reponses.add(repOuverte); // ajout de cette réponse à la liste de réponses
            }   
        }
        
        // si l'affichage des résultats est autorisé on affiche le résultat du sondage pour l'élève
        if (affichageResultats == true){
            // affichage en direct du total du sondage
            System.out.println("\nVoici l'ensemble des réponses du sondage : \n\n");
            affichageTotalReponses(); // affichage des réponses
        }
        
        System.out.println("\nMerci pour votre participation à ce sondage.\n");
    }
    
    // méthode permettant de rechercher les réponses d'un étudiant à un sondage
    public String searchRepStudent(Teacher teache, String mailEtud, int indiceQuest){
        for (int j=0; j<Reponses.size(); j++){
            // on parcourt le tableau des réponses
                if (indiceQuest == Reponses.get(j).getIndiceQuest() && mailEtud.equals(Reponses.get(j).getStudent().getMailStudent()) && Reponses.get(j).getIndiceRep()==-1){
                    return Reponses.get(j).getOpenRep();
                }

                else if (indiceQuest == Reponses.get(j).getIndiceQuest() && mailEtud.equals(Reponses.get(j).getStudent().getMailStudent()) && Reponses.get(j).getIndiceRep()>=0){
                    return String.valueOf(Reponses.get(j).getIndiceRep()); // on retourne l'indice de la réponse de l'étudiant
                }
            }
        return null;
    }
    
    
    
    
    // méthode pour avoir l'affichage des réponses ouvertes les plus fréquentes
    public void afficherResultatsOpenquestion(int indiceQuest){
        List <String> openRep = new <String> ArrayList();
        List <Integer> compteurRep = new <String> ArrayList();
        
        for (int i=0; i<Reponses.size(); i++){
            if (indiceQuest == Reponses.get(i).getIndiceQuest()){
                openRep.add(Reponses.get(i).getOpenRep().toLowerCase());
            }
        }
        
        for (int i=0; i<openRep.size(); i++){
            compteurRep.add(Collections.frequency(openRep, openRep.get(i)));
        }
        
        int taille = compteurRep.size();

        for (int i = 0; i < openRep.size(); i++){
            for (int j = i + 1; j < openRep.size(); j++){
                if(openRep.get(i) == null ? openRep.get(j) == null : openRep.get(i).equals(openRep.get(j))){
                    compteurRep.remove(j); 
                    j = j - 1; 
                }
            }
        }
        
        int nbrRep;

        if (openRep.size() > 2){
            nbrRep = 3;
            System.out.println("Voici les 3 réponses les plus fréquentes : ");
        }

        else {
            nbrRep = openRep.size();
            System.out.print("Voici les " + nbrRep + " réponses les plus fréquentes : ");
        }
        

        for (int i=0; i<3; i++){
            System.out.print(100 * Collections.max(compteurRep) / taille);
            System.out.print("% de : ");
            System.out.println(openRep.get(compteurRep.indexOf(Collections.max(compteurRep))));
            compteurRep.remove(compteurRep.indexOf(Collections.max(compteurRep)));
            openRep.remove(openRep.get(compteurRep.indexOf(Collections.max(compteurRep))));
            
        }  
    }
    
    // méthode pour l'affichage total des réponses à un sondage
    public void affichageTotalReponses(){
        for (int i=0 ; i<Questions.size(); i++){
        // on parcourt le tableau des questions    
        
            if (Questions.get(i).getClass().equals(Openquestion.class)){
            // si la question est une question ouverte
                System.out.println("♦ QUESTION N°" + (i+1) + " ♦\n");
                Questions.get(i).AfficherQuest(); // on affiche la question
                afficherResultatsOpenquestion(i); // on utilise la méthode d'affichage des reponses 
                // les plus répondues pour une question ouverte
            }
            
            else if (Questions.get(i).getClass().equals(Qcm.class)){
            // si la question est un QCM    
                System.out.println("♦ QUESTION N°" + (i+1) + " ♦\n");
                Questions.get(i).AfficherQuest(); // on affiche la question
                Questions.get(i).afficherScore(); // on affiche le score pour chaque réponse
            }
        }        
    }
    
    // méthode pour la sauvegarde d'un questionnaire
    public void versFichiers(FileWriter fichier) throws IOException{
        fichier.write(this.name + System.lineSeparator()); // écrit le nom du sondage
        this.teacherRespo.versFichiers(fichier); // écrit l'enseignant responsable du sondage
        

        fichier.write(this.Questions.size() + System.lineSeparator()); 
        // écris le nombre de questions du sondage
        for (int i = 0; i < this.Questions.size(); i++){
            this.Questions.get(i).versFichiers(fichier); // écrit toutes les questions du sondage
        }
        
        fichier.write(this.anonyme + System.lineSeparator()); // écrit le type de sondage (anonyme ou pas)
        fichier.write(this.affichageResultats + System.lineSeparator()); // écrit le type de diffusion des résultats
        
        fichier.write(this.Participants.size() + System.lineSeparator()); 
        // écrit le nombre de participants
        for (int i = 0; i < this.Participants.size(); i++){
            fichier.write(this.Participants.get(i) + System.lineSeparator()); // écrit les participants
        }
        
        fichier.write(code + System.lineSeparator());  // écrit le code du sondage
        
        // écrit le nombre de réponses
        fichier.write(this.Reponses.size() + System.lineSeparator()); 
        for (int i = 0; i < this.Reponses.size(); i++){
            this.Reponses.get(i).versFichiers(fichier); // écris les réponses au sondage
        }
        
        
    }

    // méthode permettant d'ajouter une réponse à la liste des réponses
    public void ajouterRep(Reponse repAjoutee) {
       this.Reponses.add(repAjoutee);
    }
    
}
