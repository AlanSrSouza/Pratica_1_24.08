package view;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ações possiveis: " +
                "\n 1 - Cadastrar Livro" +
                "\n 2 - Remover Livro" +
                "\n 3 - Cadastrar Livro" +
                "\n 4 - Cadastrar Cliente" +
                "\n 5 - Adicionar livro no compra" +
                "\n 6 - Remover livro da compra" +
                "\n 7 - Finalizar compra");
    }
}


/*
Enteidades --> MODEL (toda manipulação de dados fica nessa camada movel)
- Livro
- Cliente
- Compra

Frontend --> VIEW (simular o frontend, onde o usuário poderá interagir)
- Aplication

Mapeamento --> CONTROLLER (mapeando as requisições da VIEW para a MODEL)
- LivroController
- ClienteController
- CompraController

 */