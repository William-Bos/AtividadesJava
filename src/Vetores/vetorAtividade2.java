
package Vetores;
import java.util.Scanner;

public class vetorAtividade2 {
    static void main() {

        int [] numerosInteiros = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque 10 números por favor, números inteiros");
        for (int i = 0; i < 10; i++){
            numerosInteiros[i] = sc.nextInt();

        }
        for (int i = 0; i < 10; i++){
            System.out.printf("%d%n",numerosInteiros[i]);

        }

    }
}
