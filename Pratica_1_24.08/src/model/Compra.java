package model;

import java.util.List;

public class Compra {

    private List<Livro> livros;

    private Cliente cliente;

    private double valor;

    public Compra(List<Livro> livros, Cliente cliente, double valor) {
        this.livros = livros;
        this.cliente = cliente;
        this.valor = valor;
    }

    public List<Livro> getLivros() {

        return livros;
    }

    public void setLivros(List<Livro> livros) {

        this.livros = livros;
    }

    public Cliente getCliente() {

        return cliente;
    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
