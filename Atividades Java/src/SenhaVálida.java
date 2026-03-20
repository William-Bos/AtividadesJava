import java.util.Scanner;

public class SenhaVálida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int senhaTentaiva = sc.nextInt();
        while (senhaTentaiva != senha){
            System.out.println("Senha inválida");
            senhaTentaiva = sc.nextInt();
        }
        System.out.println("Acesso permitido");

    }
}
