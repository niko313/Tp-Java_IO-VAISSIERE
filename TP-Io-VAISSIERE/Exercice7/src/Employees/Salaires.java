package Employees;

import Employees.domain.*;
import Employees.service.Personnel;

import java.util.Scanner;

public class Salaires {

    public static void createEmployee(Personnel perso){
        // Création d'un employee
        Scanner scanner = new Scanner(System.in);
        int fonction;
        String prenom;
        String nom;
        int age;
        String date;
        Double salary;
        System.out.println("Nom : ");
        nom = scanner.next();
        System.out.println("Prenom : ");
        prenom = scanner.next();
        System.out.println("Age : ");
        age = scanner.nextInt();
        System.out.println("Date d'entrer : ");
        date = scanner.next();
        System.out.println("Salaire : ");
        salary = scanner.nextDouble();
        System.out.println("Fonction de l'employe : ");
        System.out.println("1 - Vendeur");
        System.out.println("2 - Representant");
        System.out.println("3 - Technicien");
        System.out.println("4 - Manutentionnaire");
        System.out.println("5 - Technicien à risque");
        System.out.println("6 - Manutentionnaire à risque");

        fonction = scanner.nextInt();

        switch(fonction){
            case(1):
                perso.ajouterEmploye(new Vendeur(prenom, nom, age, date, salary));
                break;
            case(2):
                perso.ajouterEmploye(new Representant(prenom, nom, age, date, salary));
                break;
            case(3):
                perso.ajouterEmploye(new Technicien(prenom, nom, age, date, salary));
                break;
            case(4):
                perso.ajouterEmploye(new Manutentionnaire(prenom, nom, age, date, salary));
                break;
            case(5):
                perso.ajouterEmploye(new TechnARisque(prenom, nom, age, date, salary));
                break;
            case(6):
                perso.ajouterEmploye(new ManutARisque(prenom, nom, age, date, salary));
                break;
        }

    }

    public static void printEmployee(Personnel perso){
        //Affiche la liste des employer
        perso.afficherSalaires();
    }

    public static void main(String[] args) {
        boolean terminer = false;
        Personnel p = new Personnel();
        Scanner sc = new Scanner(System.in);

    /**
        p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));
    **/
        System.out.println("");
        System.out.println("");
        System.out.println("********************************");
        System.out.println("*** Bienvenue dans Employees ***");
        System.out.println("********************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("**** Veuillez choisir un option : ****");
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        while(!terminer) {
            System.out.println("**************************************");
            System.out.println("1 - Créer un employeé ");
            System.out.println("2 - Afficher les employeés ");
            System.out.println("3 - Quitter l'application ");
            System.out.println("**************************************");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createEmployee(p);
                    break;
                case 2:
                    printEmployee(p);
                    break;
                case 3:
                    terminer = true;
                    System.out.println("**************************************");
                    System.out.println("************* Aurevoir ***************");
                    System.out.println("**************************************");
                    break;
                default:
                    System.out.println("Veuillez spécifier un choix correct.  ");
                    break;
            }
        }

        /**
        System.out.println(String.format(
                "Le salaire moyen dans l'entreprise est de %.2f francs.",
                p.salaireMoyen()
        ));
         **/
    }
}
