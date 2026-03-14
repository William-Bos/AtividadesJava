import java.util.Scanner;

 class Soma {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número");
        int numero1 = sc.nextInt();
        System.out.println("Insira o Segundo número");
        int numero2 = sc.nextInt();
        int resultado = numero1 +numero2;
        System.out.printf("Seu resultado é %d%n", resultado);
        sc.close();

    }
}
