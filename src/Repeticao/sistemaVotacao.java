package Repeticao;

import java.util.Scanner;

public class sistemaVotacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] votos = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Vote:");
            System.out.println("1 - Ana");
            System.out.println("2 - Bruno");
            System.out.println("3 - Carlos");
            System.out.println("4 - Daniela");

            votos[i] = sc.nextInt();

            if (votos[i] < 1 || votos[i] > 4) {
                System.out.println("Voto inválido. Tente novamente.");
                i--;
            }
        }

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;

        for (int voto : votos) {

            if (voto == 1) contador1++;
            else if (voto == 2) contador2++;
            else if (voto == 3) contador3++;
            else contador4++;
        }

        System.out.println("Resultado:");

        System.out.println("Ana: " + contador1);
        System.out.println("Bruno: " + contador2);
        System.out.println("Carlos: " + contador3);
        System.out.println("Daniela: " + contador4);


        int maior = contador1;
        String vencedor = "Ana";
        boolean empate = false;


        if (contador2 > maior) {
            maior = contador2;
            vencedor = "Bruno";
            empate = false;
        } else if (contador2 == maior) {
            empate = true;
        }

        if (contador3 > maior) {
            maior = contador3;
            vencedor = "Carlos";
            empate = false;
        } else if (contador3 == maior) {
            empate = true;
        }

        if (contador4 > maior) {
            maior = contador4;
            vencedor = "Daniela";
            empate = false;
        } else if (contador4 == maior) {
            empate = true;
        }


        if (empate) {
            System.out.println("Houve empate!");
        } else {
            System.out.println("Vencedor: " + vencedor);
        }

    }
}