import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println ("Informe a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println ("Informe a segunda nota");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2)/2;
        System.out.println("Sua nota é " + media);
        sc.close();
    }
}
