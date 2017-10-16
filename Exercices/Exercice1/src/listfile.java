import java.io.File;
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
        String pathToExplore = "C://";
        listfile diskFileExplorer = new listfile(pathToExplore, true);
        Long start = System.currentTimeMillis();
        diskFileExplorer.list();
        System.out.println("----------");
        System.out.println("Analyse de " + pathToExplore + " en " + (System.currentTimeMillis() - start) + " mses");
        System.out.println(diskFileExplorer.dircount + " dossiers");
        System.out.println(diskFileExplorer.filecount + " fichiers");
    }
}
