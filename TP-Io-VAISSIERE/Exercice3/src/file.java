import java.io.File;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Repertoire a testé ? ");
        String chemin = sc.next();
        File folder = new File(chemin);
        //File folder = new File("/Users/nicolas/Documents/B3-Ingesup/IdeaProjects/Exercices");
        File[] listOfFiles = folder.listFiles();
        //on verifier que le chemin entrer en parametre existe bien
        if (folder.exists()){
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    //on affiche les fichiers
                    System.out.println("File " + listOfFiles[i].getName());
                } else if (listOfFiles[i].isDirectory()) {
                    //on affiche les dossiers
                    System.out.println("Directory " + listOfFiles[i].getName());
                }
            }
        }
        else {
            System.out.println("repertoire " + folder + " n'existe pas. ");
        }
    }
}
