package function;

import java.util.Scanner;

public class functionExercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque tres numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maisAlto = max(a,b,c);
        mostrarResultado(maisAlto);
        sc.close();
    }
    public static int max(int x, int z, int y){
        int aux;
        if (x > y && x> z){
            aux =x;
        }
        else if(y > z){
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }
    public static void mostrarResultado(int valor){
        System.out.println("mais alto =" + valor);
    }


}
