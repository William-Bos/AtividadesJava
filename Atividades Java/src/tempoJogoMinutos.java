import java.util.Scanner;

public class tempoJogoMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        int horaTotal = horaFinal - horaInicial;
        int minutoTotal = minutoFinal - minutoInicial;
        System.out.printf("O jogo durou %d horas e %d minutos%n", horaTotal, minutoTotal);

    }
}
