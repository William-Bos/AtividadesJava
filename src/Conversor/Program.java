package Conversor;

import java.util.Scanner;
import Conversor.utils.CurrencyConverter;
public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o valor do dolar?");
        double valor = sc.nextDouble();
        System.out.println("Quantos vai querer?");
        int quantidade = sc.nextInt();
        double pagamento = CurrencyConverter.calculo(valor,quantidade);
        System.out.printf("quantidade a pagar em reais %.2f",pagamento);

    }
}
