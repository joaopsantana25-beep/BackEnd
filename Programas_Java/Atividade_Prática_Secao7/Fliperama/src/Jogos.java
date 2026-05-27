import java.util.Random;

public class Jogos {

    //fields
    private int creditosNecessarios;

    //Metodo random
    Random gerador = new Random();



    //Constructors

    public Jogos(int creditosNecessarios){
        if(creditosNecessarios>0){
            this.creditosNecessarios = creditosNecessarios;
        }
    }


    //Metodos do jogo
    public void jogar(Cartoes cartao){

        if(cartao.getSaldoAtual()< creditosNecessarios){
            System.out.println("O cartão não possui saldo para jogar");
            return;
        }

        int numeroTiquetes = gerador.nextInt(101);

        //Mostrar os saldos do cartão

        System.out.println("Número do cartão: "+cartao.getNumeroCartao());

        cartao.subtrairSaldo(creditosNecessarios);
        System.out.println("Saldo atual: "+cartao.getSaldoAtual());

        cartao.adicionarTiquetes(numeroTiquetes);
        System.out.println("Tíquetes ganho: "+numeroTiquetes);
        System.out.println("Saldo atual de tiquetes: "+ cartao.getSaldoTiquetes());

        System.out.println("Operação realizada com sucesso");
    }

}
