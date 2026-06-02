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

    public void adicionarSaldo(Cartoes cartao, int valor){
        if (valor >= 0) {
            cartao.setSaldoAtual(cartao.getSaldoAtual()+valor);
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public void subtrairSaldo(Cartoes cartao, int valor) {
        if (valor < 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (valor > cartao.getSaldoAtual()) {
            cartao.setSaldoAtual(0);
        } else {
            cartao.setSaldoAtual(cartao.getSaldoAtual()-valor);
        }
    }

    public void adicionarTiquetes(Cartoes cartao, int valor) {
        if (valor > 0) {
            cartao.setSaldoTiquetes(cartao.getSaldoTiquetes()+valor);
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void subtrairTiquetes(Cartoes cartao, int valor) {
        if (valor < 0) {
            System.out.println("Valor inválido");
            return;
        }

        cartao.setSaldoTiquetes(cartao.getSaldoTiquetes()-valor);

        if (cartao.getSaldoTiquetes()< 0) {
            cartao.setSaldoTiquetes(0);
        }
    }

    public void adicionarCreditos(int dinheiro, Cartoes cartao) {
        int numeroCreditos = dinheiro * 2;

        adicionarSaldo(cartao, numeroCreditos);
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

        subtrairSaldo(cartao1, valorTransferido);
        adicionarSaldo(cartao2, valorTransferido);


        consultarSaldo(cartao1);
        System.out.println("-----------------");
        consultarSaldo(cartao2);
        System.out.println("-----------------");

        System.out.println("Operação realizada com sucesso!");
    }

    public void transferirTiquetes(Cartoes cartao1,Cartoes cartao2,int valorTransferido){

        if(valorTransferido<=0){
            System.out.println("Valor Inválido!");
            return;
        }

        int saldoTiquetes1 = cartao1.getSaldoTiquetes();

        if(saldoTiquetes1<valorTransferido){
            System.out.println("O cartão não tem tiquetes o suficiente para transferir");
            return;
        }

        subtrairTiquetes(cartao1, valorTransferido);
        adicionarTiquetes(cartao2, valorTransferido);


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

        subtrairTiquetes(cartao,tiqueteNecessario);
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
