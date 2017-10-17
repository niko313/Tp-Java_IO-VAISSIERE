import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

public class imgcopy {

    public static void main(String[] args) throws Exception {
        //prend un image sur internet
        String imageUrl = "http://www.photodenature.fr/wp-content/uploads/2015/01/photo-photo-paysage-libre-de-droit-3.jpg";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ou enregistrer l'image ? ");
        String chemin = sc.next();
        String destinationFile = chemin+"/image.jpg";
        //String destinationFile = "/Users/nicolas/Desktop/image.jpg";

        saveImage(imageUrl, destinationFile);
    }

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl);
        InputStream is = url.openStream();
        //créer l'image a l'nedroit indiqué
        OutputStream os = new FileOutputStream(destinationFile);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }


}
