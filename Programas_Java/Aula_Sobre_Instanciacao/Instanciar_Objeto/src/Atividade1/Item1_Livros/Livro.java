package Atividade1.Item1_Livros;

public class Livro {

    //Campos
    private String titulo;
    private String autor;


    //Construtores
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    //Métodos
    public void mostrarCampos(){
        System.out.println("O nome do livro é: "+this.titulo);
        System.out.println("O autor do livro é: "+this.autor);
    }

    public void setTitulo(String titulo){
        if(titulo!=null && !titulo.isBlank()){
            this.titulo=titulo;
        }
        else{
            System.out.println("Título Inválido!");
        }
    }

    public void setAutor(String autor){
        if(autor!=null && !autor.isBlank()){
            this.autor = autor;
        }
        else{
            System.out.println("Nome do autor inválido");
        }
    }
}
