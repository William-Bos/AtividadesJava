package Matrizes;

import java.util.Scanner;

public class atividadeMatriz4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] matriz = new int[N][N];
        for (int i = 0; i <N; i++){
            for(int j = 0; j < N; j ++){
                matriz [i][j] = sc.nextInt();
            }
        }
        int [] vetor = new int[N];
        for (int i = 0; i <N; i++){
            int maior = matriz[i][0];
            for(int j = 0; j < N; j ++){
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
                vetor[i] = maior;
            }
        }
        for(int j = 0; j < N; j ++){
            System.out.println(vetor[j]);
        }

    }
}
