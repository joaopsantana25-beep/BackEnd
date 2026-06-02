import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Cartões
        Cartoes cartao1 = new Cartoes(500,500,1234);
        Cartoes cartao2 = new Cartoes(300,200,1560);

        //Jogos
        Jogos jogoAleatorio = new Jogos(40);

        //Categorias
        CategoriaPremios bonecos = new CategoriaPremios("bonecos",30,20);
        CategoriaPremios pelucias = new CategoriaPremios("pelucias",50,10);
        CategoriaPremios bicicletas = new CategoriaPremios("bicicletas",100,5);

        //Terminais
        Terminais terminal = new Terminais(bonecos,pelucias,bicicletas);

        System.out.println("=== CARREGANDO CRÉDITOS ===");

        terminal.adicionarCreditos(100, cartao1);
        terminal.adicionarCreditos(50, cartao2);

        terminal.consultarSaldo(cartao1);
        terminal.consultarSaldo(cartao2);

        System.out.println("\n=== JOGANDO ===");

        jogoAleatorio.jogar(cartao1);
        jogoAleatorio.jogar(cartao1);

        jogoAleatorio.jogar(cartao2);
        jogoAleatorio.jogar(cartao2);

        System.out.println("\n=== TRANSFERINDO CRÉDITOS ===");

        terminal.transferirCredito(
                cartao1,
                cartao2,
                cartao1.getSaldoAtual()
        );

        System.out.println("\n=== TRANSFERINDO TIQUETES ===");

        terminal.transferirTiquetes(
                cartao1,
                cartao2,
                cartao1.getSaldoTiquetes()
        );

        System.out.println("\n=== SALDOS APÓS TRANSFERÊNCIA ===");

        terminal.consultarSaldo(cartao1);
        terminal.consultarSaldo(cartao2);

        System.out.println("\n=== RESGATANDO PRÊMIOS COM CARTÃO 2 ===");

        terminal.escolherPremio(cartao2, "1");
        terminal.escolherPremio(cartao2, "2");

        System.out.println("\n=== TESTANDO CARTÃO 1 VAZIO ===");

        jogoAleatorio.jogar(cartao1);

        terminal.escolherPremio(cartao1, "1");

        System.out.println("\n=== SALDOS FINAIS ===");

        terminal.consultarSaldo(cartao1);
        terminal.consultarSaldo(cartao2);
    }
}













