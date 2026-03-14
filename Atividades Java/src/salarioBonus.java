import java.util.Locale;
import java.util.Scanner;

public class salarioBonus {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque seu nome:");
        String nome = sc.nextLine();
        System.out.println("Qual seu salário?");
        double salario = sc.nextDouble();
        System.out.println("Quantas vendas fez no mês?");
        double vendas = sc.nextDouble();
        double comissao = vendas * 0.15 + salario;
        System.out.printf("Nome:%s%n  Comissão + Salário: %.2f%n",nome, comissao);
    }
}
