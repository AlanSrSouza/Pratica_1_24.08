package service;


import model.Livro;

public class LivroService {

    private static boolean verificaCamposVazios(String titulo, String autor, String editora){
        return titulo.isEmpty() && autor.isEmpty() && editora.isEmpty();
    }

    public static Livro cadastrar(String titulo, String autor, String editora) {
        /*if (titulo.isEmpty() && !autor.isEmpty() && !editora.isEmpty()) {
            return null;
        } else {
            return new Livro(titulo, autor, editora);
        }*/
        //refatorando o codigo para um ternario
        return verificaCamposVazios(titulo, autor, editora)
                ? null
                : new Livro(titulo, autor, editora);
    }


    }






