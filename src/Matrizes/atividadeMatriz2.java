package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class atividadeMatriz2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        double[][] matriz = new double[M][N];
        double[] vetor = new double[M];

        // leitura da matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextDouble();
                vetor[i] += matriz[i][j]; // soma direta da linha
            }
        }

        // impressão do vetor resultado
        for (int i = 0; i < M; i++) {

            System.out.println(vetor[i]);

        }

        sc.close();
    }
}

