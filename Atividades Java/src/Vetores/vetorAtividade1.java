package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetorAtividade1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x = sc.nextInt();
        double [] vetor = new double[x];

        for(int i = 0; i < x; i ++) {
            vetor[i] = sc.nextDouble();
        }
        double maior = 0;
        int posicao = 0;
        for(int i = 0; i < x; i ++){
            if (vetor[i] > maior || i == 0){
                maior = vetor[i];
                posicao = i;
            }
        }
        System.out.printf("O maior número é %.2f%n Sua posição é %d%n",maior,posicao);


    }
}
