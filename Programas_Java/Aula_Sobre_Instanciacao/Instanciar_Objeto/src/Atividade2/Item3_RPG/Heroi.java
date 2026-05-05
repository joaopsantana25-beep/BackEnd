package Atividade2.Item3_RPG;

public class Heroi {
    //Campos
    private String nome;
    private String classePersonagem;
    private int nivel;

    //Construtores
    public Heroi(String nome, String classePersonagem,int nivel){
        this.nome = nome;
        this.classePersonagem=classePersonagem;
        this.nivel = nivel;
    }

    //Métodos
    public void mostarStatus(){
        System.out.println(
                "O nome do personagem é "+this.nome+
                ", sua classe é "+this.classePersonagem+
                " e seu nível é "+this.nivel);
    }

    public void aumentarNivel(){
        if(this.nivel<20) {
            this.nivel++;
        }
        else {
            System.out.println("O personagem já está no nível máximo");
        }
    }

    public void setNivel(int nivel){
        if (nivel > 0 && nivel<=20) {
            this.nivel=nivel;
        }
        else{
            System.out.println("Nível Inválido");
        }
    }

    public void setNome(String nome){
        if(nome!=null && !nome.isBlank()){
            this.nome = nome;
        }
        else{
            System.out.println("Nome inválido");
        }
    }

    public void setClassePersonagem(String classePersonagem){
        if(classePersonagem!=null && !classePersonagem.isBlank()){
            this.classePersonagem = classePersonagem;
        }
        else{
            System.out.println("Classe inválida");
        }
    }


}
