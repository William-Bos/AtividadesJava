import java.util.Scanner;
import java.util.Locale;

public class salario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque seu número: ");
        int number = sc.nextInt();
        System.out.println("Coloque seu número de horas trabalhadas do mês: ");
        int hours = sc.nextInt();
        System.out.println("Coloque quanto você ganha a hora ");
        double salaryHour = sc.nextDouble();
        double salary = salaryHour * hours;
        System.out.printf("Number: %d%nSalary= R$ %.2f%n", number, salary);



    }
}
