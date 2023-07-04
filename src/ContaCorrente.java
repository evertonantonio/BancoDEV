public class ContaCorrente extends Conta{

    public ContaCorrente(Titular titular, String conta, double saldo) {
        super(titular, conta, saldo);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }



    public void transferir(double valor, ContaPoupanca conta) {
        if(valor <= super.getSaldo()){
            conta.depositar(valor);
        }
        this.sacar(valor);
    }

    @Override
    public void exibirDados() {
        System.out.println("Conta Corrente");
        super.exibirDados();
    }
}
