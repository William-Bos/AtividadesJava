import java.util.Scanner;

public class vetorDois {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double []vet = new double[x];
        for (int i = 0; i < x; i++){
            vet[i] = sc.nextDouble();
        }
        for (int i = 0; i < x; i++){
            if (vet[i] <0){
                System.out.println(vet[i]);
            }
        }


        sc.close();
    }
}
