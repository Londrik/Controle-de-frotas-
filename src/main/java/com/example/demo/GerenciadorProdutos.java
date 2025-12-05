package com.example.demo;

import java.util.Scanner;

/**
 * Classe Principal que gerencia o menu e as operações com produtos.
 */
public class GerenciadorProdutos {

    // Array fixo para armazenar até 6 produtos, conforme solicitado.
    private static final int TAMANHO_MAXIMO = 6;
    private static Produto[] listaDeProdutos = new Produto[TAMANHO_MAXIMO];
    private static int numeroDeCadastrados = 0;

    /**
     * Método principal que inicia a execução do programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha pendente

            switch (opcao) {
                case 1:
                    cadastrarProduto(scanner);
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    pesquisarProduto(scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println(); // Linha em branco para separar as interações

        } while (opcao != 4);

        scanner.close();
    }

    /**
     * Exibe o menu principal de opções para o usuário.
     * Método sem retorno.
     */
    public static void exibirMenu() {
        System.out.println("--- MENU DE GERENCIAMENTO DE PRODUTOS ---");
        System.out.println("1. Cadastrar novo produto");
        System.out.println("2. Listar todos os produtos");
        System.out.println("3. Pesquisar um produto por nome");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    /**
     * Cadastra um novo produto no array.
     * Verifica se o array não está cheio.
     * Método sem retorno que recebe parâmetros.
     */
    public static void cadastrarProduto(Scanner scanner) {
        System.out.println("\n--- Cadastro de Novo Produto ---");
        if (numeroDeCadastrados >= TAMANHO_MAXIMO) {
            System.out.println("Erro: Limite de cadastro atingido!");
            return;
        }

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        Produto novoProduto = new Produto(codigo, nome, preco);
        listaDeProdutos[numeroDeCadastrados] = novoProduto;
        numeroDeCadastrados++;

        System.out.println("Produto cadastrado com sucesso!");
    }

    /**
     * Lista todos os produtos já cadastrados no array.
     * Método sem retorno.
     */
    public static void listarProdutos() {
        System.out.println("\n--- Lista de Produtos Cadastrados ---");
        if (numeroDeCadastrados == 0) {
            System.out.println("Nenhum produto cadastrado ainda.");
            return;
        }

        for (int i = 0; i < numeroDeCadastrados; i++) {
            System.out.println(listaDeProdutos[i].toString());
        }
    }

    /**
     * Pesquisa por um produto no array usando o nome.
     * Demonstra um método com retorno.
     */
    public static void pesquisarProduto(Scanner scanner) {
        System.out.println("\n--- Pesquisa de Produto ---");
        System.out.print("Digite o nome ou parte do nome do produto para buscar: ");
        String termoBusca = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < numeroDeCadastrados; i++) {
            // Usamos contains() para busca parcial e ignoramos maiúsculas/minúsculas
            if (listaDeProdutos[i].getNome().toLowerCase().contains(termoBusca.toLowerCase())) {
                System.out.println("Produto encontrado: " + listaDeProdutos[i].toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum produto encontrado com o termo '" + termoBusca + "'.");
        }
    }
}
