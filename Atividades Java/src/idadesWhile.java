import java.util.Scanner;

public class idadesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque a idade");
        int idade = sc.nextInt();
        int cont = 0;
        double media = 0;
        int soma = 0;
        while (idade >= 0){
            cont += 1;
            soma += idade;
            media = ( double)soma / cont;
            System.out.println("Coloque a idade");
            idade = sc.nextInt();

        }
        System.out.println(media);

    }
}
