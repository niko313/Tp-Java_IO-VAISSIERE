import java.io.File;
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

        File test = new File("c://");
        System.out.println("----------");
        listefiltrer(test);
    }

}
