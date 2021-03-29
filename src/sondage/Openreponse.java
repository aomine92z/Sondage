/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sondage;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Amine
 */
public class Openreponse extends Reponse {
    
    private String reponseDonnee; // réponse donnée par l'étudiant
    
    //constructeur
    public Openreponse (int valIndiceQuest,  Student valStud, String valReponseDonnee){
        super(valIndiceQuest, -1,  valStud); // -1 pour reconnaître la réponse ouverte
        this.reponseDonnee = valReponseDonnee;
    }
    
    // méthode permettant de récupérer la réponse ouverte donnée par un étudiant
    public String getOpenRep(){
        return this.reponseDonnee;
    }
    
    // méthode pour la sauvegarde d'une réponse ouverte
    public void versFichiers(FileWriter fichier)throws IOException{
        super.versFichiers(fichier); // methode sauvegarde de la superclasse Question
        fichier.write(this.reponseDonnee + System.lineSeparator());
    }
    
}
