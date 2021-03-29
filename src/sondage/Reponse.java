/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sondage;

import java.io.FileWriter;
import java.io.IOException;
import sondage.Student;

/**
 *
 * @author Amine
 */
public class Reponse {
    private int indiceQuest; // indice de la question pour la réponse
    private int indiceRep; // indice de la réponse (pour qcm)
    private Student stud; // étudiant ayant répondu
    
    // constructeur
    public Reponse(int valIndiceQuest, int valIndiceRep, Student valStud){
        this.indiceQuest = valIndiceQuest;
        this.indiceRep = valIndiceRep;
        this.stud = valStud;
    }
    
    // méthode permettant de récupérer l'indice d'une question
    public int getIndiceQuest(){
        return this.indiceQuest;
    }

    // méthode pour récupérer l'étudiant 
    public Student getStudent(){
        return this.stud;
    }
    
    // méthode permettant de récupérer l'indice de la réponse
    public int getIndiceRep(){
        return this.indiceRep;
    }
    
    // méthode pour obtenir la réponse ouverte
    public String getOpenRep(){
        return null;
    }
    
    // méthode de sauvegarde d'une réponse
    public void versFichiers(FileWriter fichier) throws IOException{
        stud.versFichiers(fichier);
        fichier.write(indiceQuest + System.lineSeparator());
        fichier.write(indiceRep + System.lineSeparator());   
    }
}
