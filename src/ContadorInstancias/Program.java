package ContadorInstancias;

import java.util.Locale;
import java.util.Scanner;
import ContadorInstancias.Person;
public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Bem vindo ao cadastro de usuários");
        Person x = new Person();
        System.out.println("Qual o nome do primeiro?");
        x.nome = sc.nextLine();
        System.out.println("Qual a idade do primeiro?");
        x.idade = sc.nextInt();
        sc.nextLine();

        Person.aumentarContador();

        Person y = new Person();
        System.out.println("Qual o nome do segundo?");
        y.nome = sc.nextLine();
        System.out.println("Qual a idade do segundo?");
        y.idade = sc.nextInt();
        sc.nextLine();

        Person.aumentarContador();

        Person z = new Person();
        System.out.println("Qual o nome do terceiro?");
        z.nome = sc.nextLine();
        System.out.println("Qual a idade do terceiro?");
        z.idade = sc.nextInt();
        sc.nextLine();

        Person.aumentarContador();

        System.out.println("Obrigado por usar o programa!");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);




        sc.close();

    }
}
