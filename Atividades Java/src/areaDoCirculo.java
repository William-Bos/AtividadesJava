import java.util.Scanner;
import java.util.Locale;

public class areaDoCirculo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o raio do círculo");
        double raio = sc.nextDouble();
        double raioAoQuadrado = Math.pow(raio,2);
        double n = 3.14159;
        double area = n * raioAoQuadrado;
        System.out.printf("a área do círculo é %.4f%n",area);
        sc.close();
    }
}
