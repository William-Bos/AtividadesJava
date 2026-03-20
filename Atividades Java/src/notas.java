import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        int resto = nota;

        int notaCem = resto / 100;
        resto = resto % 100;

        int notaCinquenta = resto / 50;
        resto = resto % 50;

        int notaVinte = resto / 20;
        resto = resto % 20;

        int notaDez = resto / 10;
        resto = resto % 10;

        int notaCinco = resto / 5;
        resto = resto % 5;

        int notaDois = resto / 2;
        resto = resto % 2;

        int notaUm = resto;

        System.out.println("Nota de 100: " + notaCem);
        System.out.println("Nota de 50: " + notaCinquenta);
        System.out.println("Nota de 20: " + notaVinte);
        System.out.println("Nota de 10: " + notaDez);
        System.out.println("Nota de 5: " + notaCinco);
        System.out.println("Nota de 2: " + notaDois);
        System.out.println("Nota de 1: " + notaUm);



    }

}
