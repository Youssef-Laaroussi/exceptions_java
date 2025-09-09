import java.util.Scanner;

public class TestingNumber {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Entrez un entier : ");
                int n = sc.nextInt();
                System.out.println("Vous avez saisi : " + n);
            } catch (Exception e) {
                System.out.println("Erreur : vous devez saisir un entier !");
            }


    }


}
