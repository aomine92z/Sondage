/*
La partie code du sondage sera créée ici.
 */
package sondage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Amine
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
        Site_sondage site = new Site_sondage(); // création du site
        
        try { 
        // permet de lever les exceptions sur l'ouverture du fichier
            site.depuisFichiers(); // importation données
        }   catch (NumberFormatException ex){ 
                System.out.println("Erreur de lecture du fichier.");
            }
            catch (IOException ex) {
                System.out.println("Erreur de lecture du fichier.");
            } 

        System.out.println("\nBIENVENUE SUR SONDASCHOOL !\n\n");
        System.out.println("♣ ENESEIGNANT TAPEZ 1 ♣\n♠ ELEVE TAPEZ 2 ♠");
        
        int choix1 = 0;
        
        // choix du menu Enseignant ou Élève
        while (choix1!=1 && choix1!=2){
            try {
                Scanner sc = new Scanner(System.in);
                choix1 = sc.nextInt();
            } catch(InputMismatchException ex){  
                choix1 = -1;
            }
            if (choix1!=1 && choix1!=2){
            System.out.println("Votre saisie est incorrecte. Veuillez réessayer : ");}
        }
        
        switch (choix1){
            
            case 1 : // cas où il s'agit d'un prof
                
                System.out.println("♦ INSCRIPTION TAPEZ 1 ♦\n♥ CONNEXION TAPEZ 2 ♥");
                int choix2 = 0;
                
                // choix de s'inscrire ou se connecter
                while (choix2!=1 && choix2!=2){
                    try {
                        Scanner sc2 = new Scanner(System.in);
                        choix2 = sc2.nextInt();
                    } catch(InputMismatchException ex){  
                        choix2 = -1;
                    }
                    if (choix2!=1 && choix2!=2){
                    System.out.println("\nVotre saisie est incorrecte. Veuillez réessayer : ");}
                }

                switch(choix2){
                    
                    case 1 : //inscription
                        site.ajouterNouveauProf();
                        
                    case 2 : //connexion
                        Teacher teach = new Teacher("","");
                        teach.connexion(); // permet au professeur de se connecter
                        int choix3 = 1;
                        
                        // vérifie la validité de l'identifiant et mdp
                        if (choix3==1 && site.verifConnexion(teach)==false){
                                System.out.println("TAPEZ 0 POUR QUITTER");
                                System.out.println("TAPEZ 1 POUR RÉESSAYER");
                                System.out.println("TAPEZ 2 POUR VOUS INSCRIRE");
                                
                                choix3 = -1;
                                
                                // le prof choisit de retenter de se connecter
                                // ou de s'inscrire ou de quitter
                                while (choix3!=0 && choix3!=1 && choix3!=2){
                                    try {
                                    Scanner sc3 = new Scanner(System.in);
                                    choix3 = sc3.nextInt();
                                    }   catch (InputMismatchException ex){
                                            choix3 = -1;
                                        }
                                    if (choix3!=0 && choix3!=1 && choix3!=2){
                                        System.out.println("\n\nVotre saisie est incorrecte. Veuillez réssayer : ");
                                    }
                                }
                                
                                // s'il veut retenter de se connecter
                                if (choix3==1){
                                    teach.connexion();
                                }
                                
                                // s'il veut s'inscrire
                                if (choix3==2){
                                   site.ajouterNouveauProf(); 
                                }
                            
                            // répétition tant que le prof veut retenter et que
                            // la connexion n'est pas validée
                            while (choix3==1 && site.verifConnexion(teach)==false){
                                System.out.println("TAPEZ 0 POUR QUITTER");
                                System.out.println("TAPEZ 1 POUR RÉESSAYER");
                                System.out.println("TAPEZ 2 POUR VOUS INSCRIRE");
                                
                                choix3 = -1;
                                
                                while (choix3!=0 && choix3!=1 && choix3!=2){
                                    try{
                                        Scanner sc10 = new Scanner(System.in);
                                        choix3 = sc10.nextInt();
                                    }   catch (InputMismatchException ex){
                                            choix3 = -1;
                                        }
                                    if (choix3!=0 && choix3!=1 && choix3!=2){
                                        System.out.println("\n\nVotre saisie est incorrecte. Veuillez réssayer : ");
                                    }
                                }
                                
                                if (choix3==1){
                                    teach.connexion();
                                }
                                if (choix3==2){
                                   site.ajouterNouveauProf(); 
                                }
                            }
                        
                        }
                        
                        int choix4 = 1;
                        // choix d'une action dans le menu enseignant
                        while (choix4!=6 && choix3!=0){
                            System.out.println("MENU ENSEIGNANT");
                            System.out.println("1 - AJOUTER UN NOUVEAU SONDAGE");
                            System.out.println("2 - AFFICHER VOS SONDAGES");
                            System.out.println("3 - MODIFIER UN SONDAGE");
                            System.out.println("4 - CONSULTATION GÉNÉRALE DES RÉPONSES D'UN SONDAGE");
                            System.out.println("5 - CONSULTATION DES RÉPONSES D'UN ÉTUDIANT");
                            System.out.println("6 - QUITTER");
                            System.out.println("\nChoisissez une action : ");
                            
                            // le prof choisit une action
                            try{
                            Scanner sc2 = new Scanner(System.in);
                            choix4 = sc2.nextInt();
                            } catch (InputMismatchException ex){
                                System.out.println("\n\nVotre saisie est incorrecte. Veuillez réssayer : ");
                                choix4 = 10;
                            }
                            
                            
                            switch (choix4){
                                
                                case 1 : // permet de créer un sondage
                                    site.creerSondage(teach);
                                    break;
                                    
                                case 2 : // permet d'afficher les sondages
                                    site.afficherSondage(teach);
                                    break;
                                    
                                case 3 : // permet de modifier un sondage
                                    site.modifierSondage(teach);
                                    break;
                                    
                                case 4 : // permet d'afficher les résultats
                                    site.afficherResultatTotalSondage(teach);
                                    break;
                                    
                                case 5 : // résultats d'un étudiant en particulier
                                    site.afficherStudentRep(teach);
                                    break;
                                    
                                case 6 : // quitter le menu enseignant
                                    break;
                            }
                        }
                        
                    break;
                }
                
            break;
        
            case 2 : // il s'agit d'un élève
                
                int codex = 0;
                
                Scanner scCode = new Scanner(System.in);
                System.out.println("Entrez le code du sondage. Sinon tapez 0 pour quitter l'application.");
                codex = scCode.nextInt(); // entre le code du sondage
                Questionnaire questEleve = null;
                
                // si l'élève rentre 0 on quitte le menu élève
                // sinon répétitions tant que le code ne correspond à aucun
                // questionnaire
                while (codex!=0 && questEleve == null){
                    questEleve = site.codeSondage(codex);
                    // recherche d'un sondage correspondant au code entré
                    
                    if (questEleve == null || codex < 9999){
                        //si le code n'a pas 5 chiffres ou qu'il ne correspond
                        // à aucun sondage
                        System.out.println("Ce code ne correspond à aucun sondage.");
                        System.out.println("Réessayez ou rentrez 0 pour quitter l'application.");
                        codex = scCode.nextInt();
                    }
                    
                    if (questEleve != null){
                        questEleve.lancerQuestionnaire(); 
                        // l'élève répond au sondage
                    }
                }
            break;    
        }
        
        FileWriter fichier; // création  d'un fichier
        try {
            fichier = new FileWriter("Données"); // nommé "Données"
            site.versFichiers(fichier); // on sauvegarde les nouvelles infos
            fichier.close(); // on ferme le fichier
        } catch (IOException ex){
            System.out.println("\nIl y a eu une erreur lors de la sauvegarde du fichier.");
        }
        
        
        System.out.println("\n\n\nMerci d'avoir utilisé notre application. A bientôt sur SondaSchool !");
        
        
    }
    
}
