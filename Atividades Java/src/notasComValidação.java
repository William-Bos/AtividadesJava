import java.util.Scanner;

public class notasComValidação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "Sim";
        while (continuar.equalsIgnoreCase("sim")) {
            int notaUm = sc.nextInt();
            while(notaUm < 0 || notaUm > 10){
                System.out.println("Valor inválido");
                System.out.println("Sua nota deve estar entre 0 e 10");
                notaUm = sc.nextInt();

            }
            int notaDois = sc.nextInt();
            while(notaDois < 0 || notaDois > 10){
                System.out.println("Valor inválido");
                System.out.println("Sua nota deve estar entre 0 e 10");
                notaDois = sc.nextInt();
            }
            double media = (double) (notaUm + notaDois) /2;
            System.out.printf("Sua média ficou em : %.2f%n", media);
            System.out.println("Gostaria de fazer o calculo novamente? sim ou não por favor");
            continuar = sc.next();

        }
    }
}
