import java.util.Scanner;

public class Terminais {
    private CategoriaPremios premio1;
    private CategoriaPremios premio2;
    private CategoriaPremios premio3;

    public Terminais(CategoriaPremios premio1, CategoriaPremios premio2, CategoriaPremios premio3){
        this.premio1 = premio1;
        this.premio2 = premio2;
        this.premio3 = premio3;
    }

    public void adicionarCreditos(int dinheiro, Cartoes cartao) {
        int numeroCreditos = dinheiro * 2;

        cartao.adicionarSaldo(numeroCreditos);

        consultarSaldo(cartao);
    }

    public void consultarSaldo(Cartoes cartao){
        System.out.println("Cartao: "+cartao.getNumeroCartao());
        System.out.println("Saldo Atual: "+cartao.getSaldoAtual());
        System.out.println("Saldo de Tiquetes: "+cartao.getSaldoTiquetes());
    }

    public void transferirCredito(Cartoes cartao1,Cartoes cartao2,int valorTransferido){

        if(valorTransferido<=0){
            System.out.println("Valor Inválido!");
            return;
        }

        int saldo1 = cartao1.getSaldoAtual();

        if(saldo1<valorTransferido){
            System.out.println("O cartão não tem saldo o suficiente para transferir");
            return;
        }

        cartao1.subtrairSaldo(valorTransferido);
        cartao2.adicionarSaldo(valorTransferido);


        consultarSaldo(cartao1);
        System.out.println("-----------------");
        consultarSaldo(cartao2);
        System.out.println("-----------------");

        System.out.println("Operação realizada com sucesso!");
    }

    public void resgatarPremios(Cartoes cartao, CategoriaPremios premio){
        int saldoTiquete = cartao.getSaldoTiquetes();
        int tiqueteNecessario = premio.getTiquetesNecessarios();
        int quantidadeDisponivel = premio.getQuantidadeDisponivel();

        if(quantidadeDisponivel==0){
            System.out.println("Não há prêmios disponíveis");
            return;
        }

        if(saldoTiquete<tiqueteNecessario){
            System.out.println("O cartão não possui tiquetes para esse prêmio");
            return;
        }

        quantidadeDisponivel--;

        cartao.subtrairTiquetes(tiqueteNecessario);
        premio.setQuantidadeDisponivel(quantidadeDisponivel);

        System.out.println("Prêmio Concedido!");
        System.out.println("Quantidade restante: " + quantidadeDisponivel);

        System.out.println("-----------------");
        consultarSaldo(cartao);

    }


    public void escolherPremio(Cartoes cartao, String escolha){

        switch (escolha){
            case "1":
                resgatarPremios(cartao,premio1);
                break;

            case "2":
                resgatarPremios(cartao,premio2);
                break;

            case "3":
                resgatarPremios(cartao,premio3);
                break;

            default:
                System.out.println("Escolha Inválida");
                break;
        }
    }

}
