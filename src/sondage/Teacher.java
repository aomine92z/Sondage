/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sondage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Amine
 */
public class Teacher {
    //attributs
    private String mail; // mail du prof
    private String password; // mot de passe

    
    // constructeur
    public Teacher (String valMail, String valPassword){
        this.mail = valMail;
        this.password = valPassword;
    }
    
    // autres méthodes 
    
    //méthodes pour récupérer les attributs en dehors de la classe :
    
    // pour le mail :
    public String getMail(){
        return mail;
    }
    

    // pour le mot de passe :
    public String getMDP(){
        return password;
    }
    
    // méthode pour s'inscrire ou se connecter
    public Teacher connexion(){
        Scanner sc = new Scanner(System.in);

        
            System.out.println("Connectez-vous :");
            System.out.println();
            System.out.println("Identifiant : ");
            String idd = sc.nextLine();
            System.out.println("Mot de passe :");
            String mdp = sc.nextLine();
            this.mail = idd;
            this.password = mdp;
            
        return this;
    }
    
    // méthode pour s'inscrire
    public Teacher inscription(String email, String motdeP){
        this.mail = email;
        this.password = motdeP;
        return this;
    }
    
    // méthode pour la sauvegarde d'un enseignant
    public void versFichiers(FileWriter fichier) throws IOException{
        fichier.write(mail + System.lineSeparator());
        fichier.write(password + System.lineSeparator());
    } 
}
    
    
