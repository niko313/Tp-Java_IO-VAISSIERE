import java.io.File;
import java.util.Scanner;
public class listfile {
    private String initialpath = "";
    private Boolean recursivePath = false;
    private int filecount = 0;
    private int dircount = 0;

    private listfile(String path, Boolean subFolder) {
        super();
        this.initialpath = path;
        this.recursivePath = subFolder;
    }

    private void list() {
        this.listDirectory(this.initialpath);
    }

    private void listDirectory(String dir) {
        File file = new File(dir);
        File[] files = file.listFiles();
        if (files != null) for (File file1 : files) {
            if (file1.isDirectory()) {
                //System.out.println("Dossier: " + file1.getAbsolutePath());
                this.dircount++;
            } else {
                //System.out.println("  Fichier: " + file1.getName());
                this.filecount++;
            }
            if (file1.isDirectory() && this.recursivePath) {
                this.listDirectory(file1.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Repertoire a testé ? ");
        String chemin = sc.next();
        //String pathToExplore = "/Users/nicolas/Desktop";
        String pathToExplore = chemin;
        listfile diskFileExplorer = new listfile(pathToExplore, true);
        diskFileExplorer.list();
        System.out.println("----------");
        System.out.println("Analyse de " + pathToExplore);
        System.out.println(diskFileExplorer.dircount + " dossiers");
        System.out.println(diskFileExplorer.filecount + " fichiers");
    }
}
