package Atividade2.Item1_ContaBancaria;

public class Teste_ContaBancaria {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("Pedro",800);
        ContaBancaria conta2 = new ContaBancaria("José",8000);


        conta1.mostrarConta();
        conta2.mostrarConta();

        System.out.printf("A soma dos saldos das duas contas é: R$%.2f",(conta1.getSaldo()+ conta2.getSaldo()));
    }
}
