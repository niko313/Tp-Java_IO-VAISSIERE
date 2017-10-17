import java.io.File;
import java.util.Scanner;

public class filter {

    public static void listefiltrer(File repertoire){

        String [] listefichiers;
        String extension = ".java";
        int i;
        listefichiers=repertoire.list();
        for(i=0;i<listefichiers.length;i++){
            if(listefichiers[i].endsWith(extension)){
                System.out.println(listefichiers[i]);
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Repertoire a testé ? ");
        String chemin = sc.next();
        File test;
        test = new File(chemin);
        System.out.println("----------");
        listefiltrer(test);
    }

}
