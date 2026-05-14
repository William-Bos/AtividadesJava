package Matrizes;

import java.util.Scanner;

public class atividadeMatriz1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque um numero para fazer o quadrado");
        int quadrado = sc.nextInt();
        int [][] matriz = new int [quadrado] [quadrado];
        int quantidadeNegativos = 0;
        for(int i = 0; i < quadrado; i ++){
            for(int j = 0; j< quadrado; j ++){
                matriz [i][j] = sc.nextInt();
                if (matriz[i][j] < 0){
                    quantidadeNegativos++;
                }
            }
        }
        System.out.printf("Diagonal principal:%n");
        for(int i = 0; i < quadrado; i ++){
            System.out.printf(matriz[i][i] + " ");
        }
        System.out.printf("%n");
        System.out.print("Quantidade de negativos = " + quantidadeNegativos);
    }
}
