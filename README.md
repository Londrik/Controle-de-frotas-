# Projeto de Gerenciamento de Produtos em Java

Este projeto é uma aplicação de console simples, desenvolvida em Java, para atender aos requisitos de um exercício de Programação Orientada a Objetos (POO). O sistema permite cadastrar, listar e pesquisar produtos.

## Arquitetura do Projeto

A aplicação foi estruturada em duas classes principais para separar as responsabilidades, seguindo os princípios de POO:

1.  **`Produto.java` (Classe Modelo):** Representa a estrutura de dados de um produto. Ela contém os atributos (`codigo`, `nome`, `preco`) e os métodos de acesso (getters e setters), garantindo o encapsulamento dos dados.

2.  **`GerenciadorProdutos.java` (Classe Principal):** Contém a lógica principal da aplicação. É responsável por:
    *   Exibir o menu interativo para o usuário.
    *   Ler a entrada do usuário.
    *   Gerenciar um array fixo para armazenar os produtos.
    *   Orquestrar as operações de cadastro, listagem e pesquisa.

---

## Como Executar o Programa

O projeto utiliza o Maven. Para compilar e executar a aplicação, utilize o seguinte comando no terminal. Ele irá iniciar o programa a partir da classe `GerenciadorProdutos`:

```sh
mvn exec:java -Dexec.mainClass="com.example.demo.GerenciadorProdutos"
```

Após executar o comando, o menu interativo será exibido no console.

---

## Funcionalidades e Exemplos de Saída

### 1. Menu Principal

Ao iniciar, o programa exibe um menu com as opções disponíveis.

**Exemplo de Saída:**

```
--- MENU DE GERENCIAMENTO DE PRODUTOS ---
1. Cadastrar novo produto
2. Listar todos os produtos
3. Pesquisar um produto por nome
4. Sair
Escolha uma opção:
```

### 2. Cadastrar Produto

O usuário pode adicionar um novo produto fornecendo código, nome e preço. O sistema armazena até 6 produtos.

**Exemplo de Interação:**

```
Escolha uma opção: 1

--- Cadastro de Novo Produto ---
Digite o código do produto: 101
Digite o nome do produto: Teclado Mecanico
Digite o preço do produto: 250.00
Produto cadastrado com sucesso!
```

### 3. Listar Produtos

Esta opção exibe todos os produtos que foram cadastrados.

**Exemplo de Saída:**

```
Escolha uma opção: 2

--- Lista de Produtos Cadastrados ---
Produto [Código=101, Nome='Teclado Mecanico', Preço=R$ 250.0]
Produto [Código=102, Nome='Mouse Gamer', Preço=R$ 120.0]
```

### 4. Pesquisar Produto

Permite buscar por um produto no array a partir de uma parte do seu nome. A busca não diferencia maiúsculas de minúsculas.

**Exemplo de Saída:**

```
Escolha uma opção: 3

--- Pesquisa de Produto ---
Digite o nome ou parte do nome do produto para buscar: mouse
Produto encontrado: Produto [Código=102, Nome='Mouse Gamer', Preço=R$ 120.0]
```

---

## Observação sobre os Imports do Spring Boot

No projeto, existe um arquivo chamado `DemoApplication.java` que contém `imports` como:

*   `org.springframework.boot.SpringApplication`
*   `org.springframework.boot.autoconfigure.SpringBootApplication`
*   `org.springframework.web.bind.annotation.RestController`

**Explicação:** Esses imports pertencem ao **Spring Boot**, um framework para criar aplicações **web**. O arquivo `DemoApplication.java` foi gerado automaticamente pelo ambiente de desenvolvimento como um modelo para um projeto web.

Para este exercício, que é uma **aplicação de console**, nós **não utilizamos** o Spring Boot. Toda a lógica está contida nos arquivos `Produto.java` e `GerenciadorProdutos.java`, que são independentes e não precisam desses imports. Portanto, o arquivo `DemoApplication.java` pode ser ignorado no contexto deste trabalho.
