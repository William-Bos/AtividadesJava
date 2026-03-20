import java.util.Scanner;

public class ValoresWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorUm = sc.nextInt();
        int valorDois = sc.nextInt();
        while (valorUm != valorDois){
            if (valorUm>valorDois){
                System.out.println("Decrescente");
            }else if(valorDois>valorUm){
                System.out.println("Crescente");

            }
            valorUm = sc.nextInt();
            valorDois = sc.nextInt();
        }
    }
}
