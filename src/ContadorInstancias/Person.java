package ContadorInstancias;

public class Person {
    String nome;
    int idade;
    public static int contador = 0;

    public static void aumentarContador() {
        contador++;
    }

    @Override
    public String toString() {
        return String.format("Nome : %s%nIdade = %d",nome,idade);
    }
}
