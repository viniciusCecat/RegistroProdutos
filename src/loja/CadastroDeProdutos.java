package loja;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu de Cadastro de Produtos ---");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Exibir produtos cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();

                    Produto produto = new Produto(nome, preco, quantidade);
                    produtos.add(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:

                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n--- Produtos Cadastrados ---");
                        for (Produto p : produtos) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:

                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
