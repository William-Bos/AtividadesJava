package vetorComObjetoAtividades.atividade1;

import java.util.Scanner;
import vetorComObjetoAtividades.atividade1.Pessoa;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas?");
        int x = sc.nextInt();
        Pessoa [] vet = new Pessoa[x];
        for (int i = 0; i < vet.length; i++){
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome:  ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade:  ");
            int idade = sc.nextInt();
            System.out.print("Altura:  ");
            double altura = sc.nextDouble();
            vet[i] = new Pessoa(nome,idade,altura);
        }
        double soma = 0;
        for (int i = 0; i < vet.length; i++){
            soma += vet[i].getAltura();

        }
        double media = soma / vet.length;
        System.out.printf("Altura média das pessoas:   %.2f%n", media);
        int contador = 0;
        String [] vetNome = new String[x];
        for (int i = 0; i < vet.length; i++){
            if (vet[i].getIdade() < 16){
                contador++;
                vetNome[i] = vet[i].getNome();
            }
        }
        double porcentagem = ((double) contador / vet.length) * 100;
        System.out.printf("Existem %d pessoas com menos de 16 anos, totalizando %.2f%% do total%nSeus nomes são:%n", contador,porcentagem);
        for (int i = 0; i < vetNome.length; i++) {
            if (vetNome[i] != null) {
                System.out.printf(vetNome[i] + "%n");
            }
        }
        sc.close();

    }
}
