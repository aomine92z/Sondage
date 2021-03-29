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
public class Openquestion extends Question{
    
    //constructeur
    public Openquestion(String valIntitule){
        super(valIntitule);
    }
    
    //autres méthodes
    public void AfficherQuest(){
        System.out.println(super.getIntituleQuest());
        // affiche l'intitulé de la question 
    }
    
    // méthode de sauvegarde pour une question ouverte
    public void versFichiers(FileWriter fichier) throws IOException{
        fichier.write("O" + System.lineSeparator()); 
        // "O" permet l'identification d'une question ouverte lors de l'importation
        fichier.write(super.getIntituleQuest() + System.lineSeparator());
        // écris l'intitulé de la question
    }
}
