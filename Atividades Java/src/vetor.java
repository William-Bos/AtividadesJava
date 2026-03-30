import java.util.Locale;
import java.util.Scanner;


public class vetor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double [] array = new double[x];
        for (int i = 0; i < x; i++){
            array[i] = sc.nextDouble();
        }
        for (int i = 0; i<x;i++){
            System.out.printf("%.2f%n",array[i]);
        }
        sc.close();
    }
}
