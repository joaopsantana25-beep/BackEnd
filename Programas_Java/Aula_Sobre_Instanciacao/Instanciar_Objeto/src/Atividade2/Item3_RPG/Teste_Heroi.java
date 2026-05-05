package Atividade2.Item3_RPG;

public class Teste_Heroi {
    public static void main(String[] args){
        Heroi Aragorn = new Heroi("Aragorn","Guerreiro",10);
        Heroi Gandalf = new Heroi("Gandalf","Mago",20);


        Aragorn.mostarStatus();

        Aragorn.aumentarNivel();

        Aragorn.mostarStatus();

        Gandalf.aumentarNivel();
    }
}
