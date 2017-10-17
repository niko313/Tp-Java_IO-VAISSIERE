import java.io.*;
import java.util.Scanner;

public class writefile {

    public static void writerfile(File writer){
        Scanner sc = new Scanner(System.in);
        // On verifie que le fichier n'est pas un doosier, qu'il existe et que donc on peut ecrire dedans
        if (writer.exists() && writer.isFile() && writer.canWrite()) {

            BufferedWriter buffer;
            FileWriter write;

            try {

                write = new FileWriter(writer);
                buffer = new BufferedWriter(write);
                String line = "";
                int i = 1;

                System.out.println("Ecriver les données et terminé par : 'Quit' : ");

                while (!line.equalsIgnoreCase("Quit")) {
                    line = sc.nextLine();
                    if (!line.equalsIgnoreCase("Quit")) buffer.write(line);
                }

                System.out.println(" termminé ");

                buffer.close();
                write.close();

            } catch (IOException e) {

                e.printStackTrace();

            }

        } else {
            System.out.println("Erreur, Ce n'est pas un fichier. ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chemin du fichier a ecrire : ");
        String chemin = sc.next();
        File towrite = new File(chemin);

        writerfile(towrite);
    }
}
