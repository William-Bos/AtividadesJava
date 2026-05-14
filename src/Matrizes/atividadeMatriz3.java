package Matrizes;

import java.util.Scanner;

public class atividadeMatriz3 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int numeroNegativo = 0;
        int [][] matriz = new int[M ][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j<N;j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.printf("Valores negativos:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] < 0) {
                    System.out.print(matriz[i][j]);
                }
            }
        }
    }
}

