package Vetores;
import java.util.Scanner;
public class vetorAtividade3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int [] array = new int [8];
        System.out.println("Coloque 8 números para popular o array");
        for(int i=0; i < 8; i++){

            int x = sc.nextInt();
            array[i] = x;

        }
        int soma =0;
        for(int i = 0; i < 8; i++){
            soma += array[i];
        }
        System.out.printf(" A soma ficou em %d%n0", soma);

    }
}
