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

    public void adicionarSaldo(int valor){
        if (valor >= 0) {
            this.saldoAtual += valor;
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public void subtrairSaldo(int valor) {
        if (valor < 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (valor > this.saldoAtual) {
            this.saldoAtual = 0;
        } else {
            this.saldoAtual -= valor;
        }
    }

    public void adicionarTiquetes(int valor) {
        if (valor > 0) {
            this.saldoTiquetes += valor;
        } else {
            System.out.println("Valor inválido");
        }

    }

    public void subtrairTiquetes(int valor) {
        if (valor < 0) {
            System.out.println("Valor inválido");
            return;
        }

        this.saldoTiquetes -= valor;

        if (this.saldoTiquetes < 0) {
            this.saldoTiquetes = 0;
        }
    }


}
