package Atividade1.Item1_Livros;

public class Livros_Inseridos {
    public static void main(String[] args){
        Livro livro1 = new Livro("O Alquimista","Paulo Coelho");
        Livro livro2 = new Livro("Dom Casmurro","Machado de Assis");


        livro1.mostrarCampos();
        livro2.mostrarCampos();
    }
}
