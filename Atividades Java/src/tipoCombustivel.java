import java.util.Scanner;

public class tipoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual número gostaria de descodificar? 1/2/3?se gostaria de sair digite 4");
        int numero = sc.nextInt();
        while (numero != 4){
            if(numero == 1){
                System.out.println("Alcool : 1");
            }else if (numero ==2){
                System.out.println("Gasolina : 2");
            }else if (numero == 3){
                System.out.println("Diesel : 1");
            }else{
                System.out.println("Coloque um número válido");
            }
            System.out.println("Qual número gostaria de descodificar? 1/2/3?se gostaria de sair digite 4");
            numero = sc.nextInt();


        }

    }
}
