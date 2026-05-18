package Vetores.comObjeto;

import java.util.Scanner;
import Vetores.comObjeto.Produto;


public class vetorAtividade4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Produto produto;
        System.out.println("Coloque o número de produtos que quer adicionar:");
        int x = sc.nextInt();
        Produto [] vet = new Produto[x];
        for(int i = 0; i <vet.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vet[i] = new Produto(name,price);
        }
        double sum = 0.0;
        for(int i = 0; i <x; i++){
            sum += vet[i].getPrice();
        }
        double avg = sum/x;
        System.out.print(x);


        sc.close();

    }
}
