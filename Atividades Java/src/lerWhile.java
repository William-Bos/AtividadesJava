import java.util.Scanner;

public class lerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int soma = 0;
        int contador = 0;
        while (idade > 0) {
            contador += 1;
            soma += idade;
            idade = sc.nextInt();
        }
        if (contador >= 0) {
            System.out.println("Impossivel calcular");
        } else {
            double media = (double) soma / contador;
            System.out.printf("%.2f%n", media);
        }

    }
}
