package Atividade1.Item2_Alunos;

public class Aluno {

    //Campos
    private String nome;
    private double nota;

    //Construtores
    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    //Métodos
    public void mostrarInformacoes(){
        System.out.printf("O nome do aluno é %s e sua nota é %.2f \n",nome,nota);
    }

    public void setNome(String nome){
        if(nome!=null && !nome.isBlank()){
            this.nome= nome;
        }
        else{
            System.out.println("Nome Inválido");
        }
    }

    public void setNota(double nota){
        if(nota>=0 && nota<=10){
            this.nota=nota;
        }
        else{
            System.out.println("Nota Inválida");
        }
    }
}
