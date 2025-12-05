package com.example.demo;

/**
 * Classe Modelo que representa um Produto.
 * Contém os atributos e os métodos de acesso (getters e setters).
 */
public class Produto {

    // Atributos privados para garantir o encapsulamento
    private int codigo;
    private String nome;
    private double preco;

    /**
     * Construtor para inicializar um objeto Produto com seus dados.
     * @param codigo O código único do produto.
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     */
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos "get" para acessar os valores dos atributos

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Métodos "set" para modificar os valores dos atributos

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Retorna uma representação em String do objeto Produto.
     * Facilita a exibição dos dados do produto.
     */
    @Override
    public String toString() {
        return "Produto [Código=" + codigo + ", Nome='" + nome + "', Preço=R$ " + preco + "]";
    }
}
