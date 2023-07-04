public abstract class Conta {

    private Titular titular;
    private String conta;
    private double saldo;

    public Conta(Titular titular, String conta, double saldo) {
        this.titular = titular;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor >= 1){
            this.saldo = this.saldo + valor;
            System.out.println("Operação realizado com sucesso!");
        }else {
            System.out.println("Operação SEM sucesso!");
        }

    }

    public void sacar(double valor){
        if(valor >= 1){
            if(valor <= this.saldo){
                this.saldo = this.saldo - valor;
                System.out.println("Operação realizado com sucesso!");
            }else {
                System.out.println("saldo insuficiente!");
            }
        }else {
            System.out.println("Operação SEM sucesso!");
        }
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.titular.getNome());
        System.out.println("Conta: " + this.conta);
        System.out.println("Saldo: R$"+ this.saldo);
    }


}
