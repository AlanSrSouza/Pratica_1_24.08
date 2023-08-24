package model;


public class Livro {

    private String Titulo;
    private String Autor;
    private String Editora;

    public String getTitulo() {
        return Titulo;
    }

    public Livro(String titulo, String autor, String editora) {
        Titulo = titulo;
        Autor = autor;
        Editora = editora;
    }

    public void setTitulo(String titulo) {

        Titulo = titulo;
    }

    public String getAutor() {

        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }



}
