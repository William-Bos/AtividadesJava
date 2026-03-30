import java.util.Scanner;

public class vetorTres {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double [] vet = new double[x];
        for (int i = 0; i <x; i ++){
            vet[i] = sc.nextDouble();
        }
        for (int i = 0; i <x; i ++){
            System.out.println(vet[i]);
        }
        double soma = 0;
        double media = 0;
        for (int i = 0; i <x; i ++){
            soma += vet[i];
        }
        System.out.println(soma);
        for (int i = 0; i <x; i ++){
            media = soma / x;
        }
        System.out.println(media);
        sc.close();
    }
}
