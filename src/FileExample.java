import java.io.*;

public class FileExample {

    public static void main(String[] args) {


        try {
            BufferedReader br = new BufferedReader(new FileReader("/yourpath/data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : Fichier introuvable !");
        } catch (IOException e) {
            System.out.println("Erreur de lecture du fichier !");
        }




    }

}
