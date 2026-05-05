package Atividade1.Item3_ControleDeCelulares;

public class Teste_Celulares {
    public static void main(String[] args){
    Celular celular1= new Celular("iPhone",128);
    Celular celular2 = new Celular("Samsung",256);

    celular2.mostrarInformacoes();

    //Alteração de Informações do Celular 2
    celular2.setArmazenamento(512);

    celular2.mostrarInformacoes();
}
}