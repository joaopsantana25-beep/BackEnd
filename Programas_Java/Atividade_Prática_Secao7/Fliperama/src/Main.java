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


        //Teste do Código
    /*
        //Carregue os créditos em cada cartão

        cartao1.adicionarSaldo(50);
        terminal.consultarSaldo(cartao1);

        cartao2.adicionarSaldo(30);
        terminal.consultarSaldo(cartao2);

        //Jogue um grupo de jogos usando dois cartoes

        jogoAleatorio.jogar(cartao1);

        jogoAleatorio.jogar(cartao2);


        //Transferir créditos do cartão 1 para o 2

        terminal.transferirCredito(cartao1,cartao2,50);


        //Solicitar prêmios com o cartão 2
        System.out.println("Os prêmios são: ");
        System.out.println("Premio 1: bonecos");
        System.out.println("Premio 2: pelucias");
        System.out.println("Premio 3: bicicletas");
        System.out.print("Escolha um prêmio : ");

        String escolha = scanner.nextLine();

        terminal.escolherPremio(cartao2,escolha);



        //Tente jogar um jogo e solicitar um prêmio com o cartão 1

        jogoAleatorio.jogar(cartao1);
        terminal.escolherPremio(cartao1,"3");

     */

        //Execute quaisquer outras ações que sejam necessárias para testar seu programa.










    }
}
