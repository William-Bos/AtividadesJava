import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class notasCondicional {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua nota do primeiro semestre?");
        double nota1 = sc.nextDouble();
        System.out.println("Qual sua nota do segundo semestre?");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) /2;
        System.out.printf("Nota final = %.1f%n", media);
        if(media < 60.00){
            System.out.println("Reprovado");
        }

    }

}
