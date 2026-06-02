public class Cartoes {

    //Fields
    private int saldoAtual;
    private int saldoTiquetes;
    private int numeroCartao;


    //Constructor
    public Cartoes(int saldoAtual, int saldoTiquetes, int numeroCartao) {
        if (saldoAtual >= 0) {
            this.saldoAtual = saldoAtual;
        } else {
            System.out.println("Valor inválido");
            this.saldoAtual = 0;
        }

        if (saldoTiquetes >= 0) {
            this.saldoTiquetes = saldoTiquetes;
        } else {
            System.out.println("Valor inválido");
            this.saldoTiquetes = 0;
        }

        this.numeroCartao = numeroCartao;
    }

    //Métodos getters
    public int getNumeroCartao() {
        return this.numeroCartao;
    }

    public int getSaldoAtual() {
        return this.saldoAtual;
    }

    public int getSaldoTiquetes() {
        return this.saldoTiquetes;
    }


    //Métodos setters
    public void setSaldoAtual(int valor) {
        if (valor >= 0) {
            this.saldoAtual = valor;
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public void setSaldoTiquetes(int valor) {
        if (valor >= 0) {
            this.saldoTiquetes = valor;
        } else {
            System.out.println("Valor Inválido");
        }
    }
}
