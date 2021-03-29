/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sondage;

import java.io.FileWriter;
import java.io.IOException;

/** créer des classes
 *
 * @author Amine
 */
public class Question {
    
    // attributs 
    private String intituleQuest; // la question elle même
    
    // constructeur
    public Question (String valIntitule){
        this.intituleQuest = valIntitule;  
    }
    
    // autres méthodes 
    
    //méthode pour récupérer la question
    public String getIntituleQuest() {
        return intituleQuest;
    }
    //méthode pour afficher une question
    public void AfficherQuest(){
    }
    
    // méthode pour ajouter score pour les QCM
    public void ajouterScore(int indiceRepDonnee){
    }
    
    // méthode pour afficher score pour les QCM
    public void afficherScore(){      
    }
    
    // méthode pour la sauvegarde d'une question
    public void versFichiers(FileWriter fichier) throws IOException{ 
    }
}
