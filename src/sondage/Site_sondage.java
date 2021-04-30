/*
regroupe tous les sondages et tous les enseignants
 */
package sondage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Amine
 */
public class Site_sondage {
    
    // attributs 
    private List<Teacher> ProfList = new ArrayList<Teacher>(); // liste des enseignants inscrits au site
    private List<Questionnaire> QuestList = new ArrayList<Questionnaire>(); // liste des sondages du site
    private String nom_site; // nom du site
    
    
    // constructeur
    public Site_sondage (){
        this.nom_site = "SondaSchool";
    }
    
    // autres méthodes 
    
    public Questionnaire searchSondage(String nameProf, String nameSondage){
        for (int i=0; i<QuestList.size(); i++){
            if (nameSondage.equals(QuestList.get(i).getName())){
                for (int j=0; j<ProfList.size(); j++){
                    if(nameProf.equals(ProfList.get(i).getMail())){
                        return QuestList.get(i);
                    }
                }
                
            }
        }
        return null;
    }
    
    //méthode pour valider la connexion d'un prof
    public boolean verifConnexion(String nameUser, String vPassword){
        

        // on parcourt le tableau des profs dans le site
        for (int i=0; i<ProfList.size(); i++){
            // si le mail entré correspond au mail d'un prof inscrit au site et que le mot de passe est correct
            if ((nameUser.compareTo(ProfList.get(i).getMail())==0) && (vPassword.compareTo(ProfList.get(i).getMDP())==0)) {
                System.out.println("\nCONNEXION REUSSIE.\n");
                return true; // on valide la connexion
            }
            // si le mail entré correspond au mail d'un prof inscrit au site et que le mot de passe est incorrect
            else if ((nameUser.compareTo(ProfList.get(i).getMail())==0) && (vPassword.compareTo(ProfList.get(i).getMDP())!=0)){
                System.out.println("\nMOT DE PASSE INCORRECT.\n");
                return false; // on invalide la connexion pour mot de passe incorrect
            }
        }
        
        // on parcourt la liste de profs
        for (int i=0; i<ProfList.size(); i++){
            // si le mail entré est introuvable
            if (nameUser.compareTo(ProfList.get(i).getMail())!=0){
                if (i==(ProfList.size()-1)){
                    System.out.println("\nIDENTIFIANT INTROUVABLE.\n");
                    return false; // on invalide la connexion pour identifiant introuvable
                }
            }
            else{
                break;
            }     
        }
        
    return false; // connexion non-validée
    }

    
    //méthode pour ajouter un nouveau prof au tableau
    public void ajouterNouveauProf(String mailo, String MDPo) {
        Teacher t = new Teacher("mina", "mdpa");
        t.inscription(mailo, MDPo);
        ProfList.add(t);
        // inscription d'un prof et ajout de celui-ci à la liste de profs du site
    }

    //méthode pour créer un sondage
    public void creerSondage(String vNomS, boolean vanonyme, boolean vaffichage, Teacher teache){
        System.out.println("\nAJOUT D'UN SONDAGE : \n");

        // le professeur donne un nom au sondage
        //Scanner scNom = new Scanner(System.in);

        // le professeur choisit si la participation est anonyme
//        System.out.println("PARTICIPATION ANONYME ?");
//        System.out.println("1 - Oui");
//        System.out.println("2 - NON");
//        Scanner sc1 = new Scanner(System.in);
//        int choix1 = sc1.nextInt();
//        if (choix1==1){
//            anonyme = true;
//        }

        // le professeur choisit si les résultats sont affichés en temps réel
//        boolean affichage = false;
//        System.out.println("AFFICHAGE DES RÉSULTATS EN TEMPS RÉEL ?");
//        System.out.println("1 - Oui");
//        System.out.println("2 - NON");
//        Scanner sc2 = new Scanner(System.in);
//        int choix2 = sc1.nextInt();
//        if (choix2==1){
//            affichage = true;
 //       }
        Random rand = new Random();
        int nouvCode = rand.nextInt(90000) + 10000;
        
        // création du nouveau sondage avec les données transmises par le professeur
        Questionnaire nouveauQuestionnaire = new Questionnaire(vNomS,teache,  new <Question> ArrayList(), new <String> ArrayList(), vanonyme, vaffichage, nouvCode);

        // ajouter des questions au questionnaire
        nouveauQuestionnaire.ajouterQuestion();
        // ajouter des participants au questionnaire
        nouveauQuestionnaire.ajouterParticipant();

        // ajoute le nouveau questionnaire à l'ensemble des sondages du site
        QuestList.add(nouveauQuestionnaire);
        }

    public void afficherSondage(Teacher teache){
        // on parcourt les tableau des sondages
        for (int i =0; i<QuestList.size(); i++){
            // si le mail du prof connecté correspond au mail du prof responsable d'un sondage
            if(teache.getMail().equals(QuestList.get(i).getTeacher().getMail())){
                System.out.println("  - SONDAGE N°" + (i+1) + " --\n");
                QuestList.get(i).afficherSondage(); // on affiche le sondage en question
            }
        }
    }
    
    // méthode permettant de modifier un sondage existant
    public void modifierSondage(Teacher teache){
        System.out.println("Voici la liste de tous vos sondages : \n\n");
        afficherSondage(teache); 
        // on affiche les sondages pour que le prof choisisse le nom exact du sondage à modifier 
        System.out.println("Veuillez entrer le nom exact du sondage à modifier : ");
        Scanner sc = new Scanner(System.in);
        String nomSondage =sc.nextLine(); // le prof connecté entre le nom du sondage à modifier
        
        Questionnaire sondageModif = null; // création d'un nouveau sondage null
        
        // on parcourt la liste des sondages
        for (int i=0; i<QuestList.size(); i++){
            // si le nom de sondage entré correspond à un sondage existant 
            // et que le mail du prof connecté correspond aussi à ce même sondage
            if (nomSondage.equals(QuestList.get(i).getName()) && teache.getMail().equals(ProfList.get(i).getMail())){
                sondageModif = QuestList.get(i); 
                // sondageModif n'est plus un null et devient le sondage en question
            }
        }
        
        // si sondageModif est resté null
        if (sondageModif==null){
            System.out.println("Le nom de sondage que vous avez entré ne correspond pas à l'un de vos sondages.");
        }
        
        // si sondageModif n'est plus null
        if (sondageModif!=null){
            int choix = 1;
            while (choix != 5){
                System.out.println("Menu modification sondage");
                System.out.println("1 - SUPPRIMER SONDAGE");
                System.out.println("2 - MODIFIER NOM");
                System.out.println("3 - AJOUTER QUESTIONS");
                System.out.println("4 - AJOUTER PARTICIPANTS");
                System.out.println("5 - QUITTER");
                System.out.println("\nChoisissez une action : ");
                choix = sc.nextInt(); // le prof choisit une option
                
                switch (choix){
                    
                    case 1: // on supprime le sondage
                        System.out.println("\nVoulez-vous vraiment supprimer ce sondage ?");
                        System.out.println("1 - Oui");
                        System.out.println("2 - Non");
                        int choix1 = sc.nextInt(); // est-il sur de le supprimer????
                        if (choix1==1){
                            QuestList.remove(sondageModif); 
                            // si oui, on retire le sondage de la liste des osndages du site
                            System.out.println("Le sondage a été supprimé avec succès.");
                        }
                        choix = 5; // on quitte le menu de modification car le sondage n'existe plus
                        break;
                        
                    case 2: // on modifie le nom du sondage
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("NOUVEAU NOM DU SONDAGE : ");
                        String newName = sc1.nextLine(); // le prof entre le nouveau nom
                        sondageModif.setName(newName); // grâce à la méthode setName()
                        break;
                        
                    case 3: // on rajoute des questions
                        sondageModif.ajouterQuestion(); 
                        // à l'aide de la méthode d'ajout de questions dans un sondage
                        break;
                        
                    case 4: // on rajoute des participants
                        sondageModif.ajouterParticipant();
                        // à l'aide de la méthode d'ajout de participants dans un sondage
                        break;
                        
                    case 5: // on quitte le menu de modification du sondage
                        break;
                }
            }
            System.out.println("Voici le sondage après modifications : \n");
            sondageModif.afficherSondage(); // on affiche le sondage une fois modifié 
        }
        
        
    }
    
    // méthode pour afficher les réponses à un sondage
    public void afficherStudentRep(Teacher teache){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nRenseignez le mail de l'étudiant dont vous voulez voir les réponses : ");
        String mailStud = sc1.nextLine(); 
        // le prof rentre le mail de l'étudiant dont il veut les réponses
        System.out.println("Voici les réponses correspondant donnée par cet étudiant : ");
        
        Student etudiantAffichage = new Student(mailStud);
        // on crée un étudiant avec le mail entré
        // on parcourt ensuite la liste des sondages
        for (int i=0; i<QuestList.size(); i++){
            // on cherche le(s) sondage(s) fait par le prof en question 
            // et au(x)quel(x) a répondu l'étudiant
            QuestList.get(i).searchStudent(teache, etudiantAffichage);
        }
    }
    
    // méthode pour l'affichage général des résulats d'un sondage
    // je ne vais pas tout commenter ici :
    // (voir ligne 144 à ligne 163 de la méthode modifierSondage()) 
    public void afficherResultatTotalSondage(Teacher teache){
        System.out.println("Veuillez entrer le nom exact du sondage dont vous voulez afficher les résultats : ");
        Scanner sc = new Scanner(System.in);
        String nomSondage = sc.nextLine(); 
        
        Questionnaire sondageAffichageResult = null;
        
        for (int i=0; i<QuestList.size(); i++){
            if (nomSondage.equals(QuestList.get(i).getName()) && teache.getMail().equals(ProfList.get(i).getMail())){
                sondageAffichageResult = QuestList.get(i);
            }
        }
        
        if (sondageAffichageResult==null){
            System.out.println("Le nom de sondage que vous avez entré ne correspond pas à l'un de vos sondages.");
        }
        
        if (sondageAffichageResult!=null){
            System.out.println("\n\nVoici un affichage total des réponses à ce sondage : \n\n");
            sondageAffichageResult.affichageTotalReponses(); 
            // on affiche toutes les réponses du sondage
        }
    }
    
    // méthode permettant de trouver un sondage grâce à son code
    public Questionnaire codeSondage(int codeEleve){
        // on parcourt la liste des sondages
        for (int i=0; i<QuestList.size(); i++){
            // si le code entré par l'élève correspond au code d'un sondage existant
            if (codeEleve == QuestList.get(i).getCode()){
                return QuestList.get(i); // on retourne le sondage en question
            }
        }
    return null; // sinon on retourne un null
    }
    
    // méthode pour la sauvegarde du site
    public void versFichiers(FileWriter fichier) throws IOException{
        
        fichier.write(this.QuestList.size() + System.lineSeparator());
        // on écrit le nombre de sondages
        
        // on écrit tous les sondages de la liste
        for (int i=0; i<this.QuestList.size(); i++){
            this.QuestList.get(i).versFichiers(fichier);
        }
        
        
        fichier.write(this.ProfList.size() + System.lineSeparator());
        // on écrit le nombre de profs inscrits au site
        
        // on écrit tous les profs inscrits
        for (int i=0; i<this.ProfList.size(); i++){
            this.ProfList.get(i).versFichiers(fichier);
        }  
    }
    
    // méthode permettant de lire le fichier de sauvegarde 
    public void depuisFichiers() throws FileNotFoundException, IOException{
        
        FileReader fichier = new FileReader("Données"); // nouveau fichier de lecture
        BufferedReader br = new BufferedReader (fichier); // nouveau BufferedReader
        
        String TailleQuestList = br.readLine(); // on lit le nombre de sondage du site
        
        // nouvelle liste de sondage
        List <Questionnaire> listeQuestionnaires = new <Questionnaire> ArrayList();
        
        // pour i allant de 0 jusqu'au nombre de sondages existants
        for (int i=0; i<Integer.valueOf(TailleQuestList); i++){
            
            String questName = br.readLine(); // on lit le nom du sondage i
            String questNameTeacher = br.readLine(); // on lit le mail du prof respo du sondage i
            String TeacherPassword = br.readLine(); // on lit son mdp
            
            // nouveau prof composé du mail et mdp lu précédemment
            Teacher RespoTeacher = new Teacher (questNameTeacher, TeacherPassword);
            
            
            String nbrQuestions = br.readLine(); // on lit le nombre de questions du sondage i
            
            // nouvelle liste de questions
            List <Question> questions = new <Question> ArrayList();
            
            // pour i allant de 0 au nombre de questions du sondage i
            for (int j=0; j<Integer.valueOf(nbrQuestions); j++){
                
                String typeQuestion = br.readLine(); // on lit la lettre "M" ou "O"
                
                // si on lit "M" alors il s'agit d'un QCM
                if ("M".equals(typeQuestion)){
                    
                    String intituleQuestion = br.readLine(); // on lit le nom de la question
                    
                    // nouvelles listes de réponses et de scores
                    List <String> reponsesQcm = new <String> ArrayList();
                    List <Integer> scoresQcm = new <Integer> ArrayList();
                    
                    String nbrReponses = br.readLine(); // on lit le nombre de réponses à la question j
                    
                    // pour k allant de 0 au nombre de réponses à la question j
                    for (int k=0; k<Integer.valueOf(nbrReponses); k++){
                        String[] tab; // nouveau tableau
                        
                        String ligne = br.readLine(); // on lit la ligne de réponses et de scores
                        tab = ligne.split("§"); // on sépare la réponse du score grâce à split()
                        // tab[0] correspond à une réponse et tab[1] correspond au score
                        
                        reponsesQcm.add(tab[0]); // on ajoute la réponse à la liste des réponses du QCM
                        scoresQcm.add(Integer.valueOf(tab[1])); // on ajoute le score à la liste des scores
                    }
                    
                    // création du nouveau QCM avec les éléments lus
                    Qcm nouvQcm = new Qcm(intituleQuestion, reponsesQcm, scoresQcm);
                    
                    // on ajoute ce QCM au questionnaire en cours de création
                    questions.add(nouvQcm);
                }
                
                // si on lit un "O" alors il s'agit d'une question ouverte
                else if ("O".equals(typeQuestion)){
                    
                    String intituleQuestion = br.readLine(); // on lit la question
                    
                    // création d'une nouvelle question ouverte avec l'élément lu
                    Openquestion nouvOpenQuest = new Openquestion(intituleQuestion);
                    
                    // on ajoute cette question ouverte au questionnaire en cours de création
                    questions.add(nouvOpenQuest);
                }
            }
            
           
            String anonymous = br.readLine(); // on lit "true" ou "false"
            boolean anonymeParticipation = true; 
            // si "false" a été lu
            if ("false".equals(anonymous)){
                anonymeParticipation = false;
            }
            
            String affichous = br.readLine(); // on lit "true" ou "false"
            boolean affichageParticipation = true;
            // si "false" a été lu
            if ("false".equals(affichous)){
                affichageParticipation = false;
            }
            
            // nouvelle liste pour les partcipants
            List <String> listParticipants = new <String> ArrayList();
            String nbrParticipants = br.readLine(); // on lit le nombre de participants au sondage i
            
            // pour l allant de 0 au nombre de participants
            for (int l=0; l<Integer.valueOf(nbrParticipants); l++){
                String participant = br.readLine(); // on lit le nom du participant l
                listParticipants.add(participant); // on ajoute ce participant à la liste de participants du sondage i
            }
            
            
            String QuestCode0 = br.readLine(); // on lit le code du sondage
            int QuestCode = Integer.valueOf(QuestCode0); // onle transforme en entier
            
            // on crée un nouveau sondage avec les éléments lus
            Questionnaire questionnaire = new Questionnaire(questName, RespoTeacher, questions, listParticipants, anonymeParticipation, affichageParticipation, QuestCode);
            
            // on ajoute ce sondage à la liste des sondages créée
            listeQuestionnaires.add(questionnaire);

            String nbrReponses = br.readLine(); // on lit le nombre de réponses
            
            // pour m allant de 0 au nombre de réponses du sondage i
            for (int m=0; m<Integer.valueOf(nbrReponses); m++){
                
                String mailStud = br.readLine(); // on lit le mail du sondé
                Student study = new Student(mailStud); // on crée un nouvel étudiant avec ce mail
                
                String indiceQ = br.readLine(); // on lit l'indice de la question répondue
                String indiceR = br.readLine(); // on lit l'indice de la réponse
                
                // si l'indice de réponse est égal à -1 il s'agit d'une réponse ouverte
                if (Integer.valueOf(indiceR)==-1){
                    String openRep = br.readLine(); // on lit cette réponse ouverte
                    
                    // on crée une nouvelle réponse ouverte
                    Reponse answer = new Openreponse(Integer.valueOf(indiceQ), study, openRep);
                    
                    // on ajoute cette réponse ouverte à la liste des réponses du sondage
                    listeQuestionnaires.get(m).ajouterRep(answer);
                }
                
                // sinon la réponse est celle d'un QCM
                else{
                    // on crée une nouvelle réponse avecles éléments lus
                    Reponse answer = new Reponse(Integer.valueOf(indiceQ), Integer.valueOf(indiceR), study);
                    
                    // on ajoute cette réponse à la liste des réponses du sondage
                    listeQuestionnaires.get(m).ajouterRep(answer);
                }   
            }
        }
        
        // on affecte à la liste des sondages du site la liste de sondages listeQuestionnaires 
        this.QuestList = listeQuestionnaires;
        
        
        
        String nbrTeachers = br.readLine(); // on lit le nombre de professeurs inscrits
        
        // nouveau tableau de profs
        List <Teacher> listeTeachers = new <Teacher> ArrayList();
        
        // pour n allant de 0 au nombre de profs inscrits
        for (int n=0; n<Integer.valueOf(nbrTeachers); n++){
            
            String mailTeach = br.readLine(); // on lit le mail du prof
            String passwordTeach = br.readLine(); // on lit le mdp correspondant
            
            // on crée un nouveau prof avec les éléments lus
            Teacher teach = new Teacher(mailTeach, passwordTeach);
            
            // on ajoute ce prof à la liste 
            listeTeachers.add(teach);
        }
        
        // on affecte à la liste des enseignants inscrits au site la liste listeTeachers
        this.ProfList = listeTeachers;
    }
}
