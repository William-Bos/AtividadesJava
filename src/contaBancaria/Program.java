package contaBancaria;

import java.util.Locale;
import java.util.Scanner;
import contaBancaria.contaBancaria;
public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        contaBancaria conta;
        System.out.print("Enter account Number:  ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account Holder:  ");
        String nome = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)?  ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value:  ");
            double valorInicial = sc.nextDouble();
            conta = new contaBancaria(numeroConta,nome, valorInicial);
        }else{
            conta = new contaBancaria(numeroConta,nome);
        }
        System.out.printf("Account data: %n" + conta + "%n");

        System.out.print("Enter a deposit value:  ");
        double valorDepositado = sc.nextDouble();
        conta.depositar(valorDepositado);
        sc.nextLine();
        System.out.printf("Updated account data:%n" + conta + "%n");

        System.out.print("Enter a withdraw value:  ");
        double valorRetirado = sc.nextDouble();
        conta.sacar(valorRetirado);
        sc.nextLine();
        System.out.printf("Updated account data:%n" + conta);



    }
}
