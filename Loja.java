package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos produtos diferentes você deseja inserir? ");
        int quantosProdutos = scanner.nextInt();
        scanner.nextLine();

        List<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < quantosProdutos; i++) {
            System.out.println("Insira o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.println("Insira o valor unitário do produto: ");
            double valorProduto = scanner.nextDouble();

            System.out.println("Insira a quantidade de produtos comprados: ");
            int qtdProduto = scanner.nextInt();
            scanner.nextLine();

            Produto produto = new Produto(nomeProduto, valorProduto, qtdProduto);
            produtos.add(produto);

            double totalComImpostoProduto = produto.calcularValorComImposto();
            System.out.printf("Produto: %s, Valor com imposto: R$%.2f%n", nomeProduto, totalComImpostoProduto);
        }
        
        double totalComImpostoGlobal = calcularTotalComImposto(produtos);
        System.out.printf("O valor total com imposto é: R$%.2f%n", totalComImpostoGlobal);
        
        scanner.close();
    }

    private static double calcularTotalComImposto(List<Produto> produtos) {
        double totalComImposto = 0;

        for (Produto produto : produtos) {
            totalComImposto += produto.calcularValorComImposto();
        }

        return totalComImposto;
    }
}


