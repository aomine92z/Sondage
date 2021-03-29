/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sondage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Amine
 */
public class Qcm extends Question {
    
    // attributs

    private List<Integer> score; // liste score pour une réponse
    private List<String> reponsesQcm; // liste de réponses possibles
    
    // constructeur
    public Qcm (String valIntitule, List<String> valReponse, List<Integer> valScore){
        super(valIntitule);
        this.reponsesQcm = valReponse;
        this.score = valScore;
    }
    
    // autres méthodes
    
    // méthode pour récupérer la liste des scores
    public List<Integer> getScore(){
        return this.score;
    } 
    
    // méthode permettant de compter le nombre de fois qu'une réponse a été choisie
    public void ajouterScore(int indiceRepDonnee){
        score.add((indiceRepDonnee - 1), 1);
    }
    
    // méthode permettant l'affichage du score pour chaque réponse en pourcentage
    public void afficherScore(){
        int nbrTotalVote = 0;
        for (int i=0; i<this.score.size(); i++){
            nbrTotalVote += score.get(i);
        }
        System.out.println();
        for (int j=0; j<this.score.size()-1; j++){
            System.out.println(((score.get(j)/nbrTotalVote)*100) + "% a choisi la réponse " + (j+1) );
        }
    }
    
    //méthode pour afficher un qcm (la question) et les réponses associées
    public void AfficherQuest(){
        System.out.println(super.getIntituleQuest());
        for (int i=0; i<reponsesQcm.size(); i++){
            System.out.println("   " + (i+1) + ") " + reponsesQcm.get(i));
        }
    }
    
    // méthode pour la sauvegarde d'un QCM
    public void versFichiers(FileWriter fichier) throws IOException{
        fichier.write("M" + System.lineSeparator()); // le "M" permet d'identifier un QCM lors de l'importation
        fichier.write(super.getIntituleQuest() + System.lineSeparator());
        
        fichier.write(this.reponsesQcm.size() + System.lineSeparator());
        
        for (int i=0; i<this.reponsesQcm.size(); i++){
                fichier.write(this.reponsesQcm.get(i) + "§" + this.score.get(i) + System.lineSeparator());
        }
    }
}
