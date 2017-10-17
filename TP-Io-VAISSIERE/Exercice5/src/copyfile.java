import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class copyfile {

    // copie le contenue du fichier 'source' dans le fichier 'result'

    public static boolean copy(File source, File result){
        try{
            java.io.FileInputStream sourceFile = new java.io.FileInputStream(source);

            try{
                java.io.FileOutputStream destinationFile = null;

                try{
                    destinationFile = new FileOutputStream(result);

                    // Lecture par segment de 0.5Mo
                    byte buffer[] = new byte[512 * 1024];
                    int nbLecture;

                    while ((nbLecture = sourceFile.read(buffer)) != -1){
                        destinationFile.write(buffer, 0, nbLecture);
                    }
                } finally {
                    destinationFile.close();
                }
            } finally {
                sourceFile.close();
            }
        } catch (IOException e){
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc_source = new Scanner(System.in);
        System.out.println("Fichier source ? ");
        String source = sc_source.next();
        File src;
        //src = new File("/Users/nicolas/Desktop/test.txt");
        src = new File(source);

        Scanner sc_result = new Scanner(System.in);
        System.out.println("Fichier de destination ? ");
        String result = sc_result.next();
        File res;
        //res = new File("/Users/nicolas/Desktop/tata.txt");
        res = new File(result);
        System.out.println("----------");
        copy(src,res);
    }
}
