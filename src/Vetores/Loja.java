package Vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String resposta;
        String compras;

        // Produtos do mercado (AGORA USADOS DE VERDADE)
        String[] mercado = {"Banana", "Maça", "Refri"};

        // Carrinho dinâmico
        ArrayList<String> carrinho = new ArrayList<>();

        System.out.println("=== MERCADO ===");
        for (String item : mercado) {
            System.out.println("- " + item);
        }

        do {
            System.out.println("\nEscolha um item do mercado:");
            compras = sc.next();

            boolean existe = false;

            // valida se o item existe no mercado
            for (String item : mercado) {
                if (item.equalsIgnoreCase(compras)) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                carrinho.add(compras);
                System.out.println(compras + " adicionado ao carrinho!");
            } else {
                System.out.println("Item não existe no mercado!");
            }

            System.out.println("Deseja comprar mais alguma coisa? (sim/nao)");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("\n=== COMPRA FINALIZADA ===");
        System.out.println("Itens no carrinho:");

        for (String item : carrinho) {
            System.out.println("- " + item);
        }

        sc.close();
    }
}