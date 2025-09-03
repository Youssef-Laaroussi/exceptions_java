import java.util.Scanner;

public class Divison {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Entrez le numérateur : ");
            int a = sc.nextInt();
            System.out.print("Entrez le dénominateur : ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Résultat = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro !");
        }
    }



    }


