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
public class Student {
    private String email; //mail de l'étudiant
    
    // constructeur
    public Student(String valMail){
        this.email=valMail;
    }
        
    // méthode pour récupérer le mail de l'étudiant
    public String getMailStudent(){
        return email;
    }
    

    // méthode pour afficher le participant
    public void Afficher(){
        System.out.println(email);
    }
    
    // méthode de sauvegarde pour les étudiants
    public void versFichiers(FileWriter fich) throws IOException{
        fich.write(email + System.lineSeparator());
    }
}


