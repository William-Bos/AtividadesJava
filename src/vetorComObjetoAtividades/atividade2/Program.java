package vetorComObjetoAtividades.atividade2;

import java.util.Scanner;
import vetorComObjetoAtividades.atividade2.Rent;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented?");
        int x = sc.nextInt();
        Rent [] rent = new Rent[10];
        sc.nextLine();
        for (int i = 0; i < rent.length; i++) {
            System.out.printf("Rent #%d:%n",i);
            System.out.print("Name:  ");
            String name = sc.nextLine();
            System.out.print("Email:  ");
            String email = sc.nextLine();
            System.out.print("Room:  ");
            int room = sc.nextInt();
            rent[room] = new Rent(name,email);
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < rent.length; i++) {
            System.out.print("Busy rooms :" + i + rent[i].getName() + rent[i].getEmail());
        }

    }
}
