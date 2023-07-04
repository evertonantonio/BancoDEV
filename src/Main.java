import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("Banco DEV");
        System.out.println("Cria agora sua conta:");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();

        int numeroConta = rand.nextInt(8999) + 1000;
        String numeroContaCorrente = numeroConta + "";
        String numeroContaPoupanca = numeroConta + "-1";

        Titular ti = new Titular(nome, endereco , cpf);
        ContaCorrente cc = new ContaCorrente(ti, numeroContaCorrente, 0);
        ContaPoupanca cp = new ContaPoupanca(ti,numeroContaPoupanca , 0);

        while(true){
            System.out.println("""
                    
                    
                    
                    --------------------------------------------------------------------
                    O que deseja fazer agora:
                    1 - Ir para a conta corrente
                    2 - Ir para a conta poupança
                    3 - Sair
                    
                    escolha uma das três opções:
                    """);
            int opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("""
                        
                        
                        
                        --------------------------------------------------------------------
                        CONTA CORRENTE
                        veja o que se pode fazer agora na conta corrente:
                        1 - Depositar dinheiro
                        2 - sacar dinheiro
                        3 - Transferir para a conta poupança
                        4 - exibir dados
                        5 - sair
                        """);

                int opcaoMenuCorrente = sc.nextInt();

                if(opcaoMenuCorrente == 1) {
                    System.out.print("Digite o valor que se deseja depositar: R$");
                    double valor = sc.nextDouble();
                    cc.depositar(valor);
                }else if(opcaoMenuCorrente == 2){
                    System.out.print("Digite o valor que se deseja sacar: R$");
                    double valor = sc.nextDouble();
                    cc.sacar(valor);
                }else if(opcaoMenuCorrente == 3) {
                    System.out.print("Digite o valor que se deseja transferir para a conta poupan�a: R$");
                    double valor = sc.nextDouble();
                    cc.transferir(valor, cp);
                }else if(opcaoMenuCorrente == 4) {
                    cc.exibirDados();
                }else if(opcaoMenuCorrente == 5) {
                    break;
                }else {
                    System.out.println("Valor errado, digite novamente!");
                }
            }

            else if(opcao == 2){

                System.out.println("""
                        
                        
                        
                        --------------------------------------------------------------------
                        CONTA POUPANÇA
                        veja o que se pode fazer agora na conta poupança:
                        1 - Tranferir para a conta corrente
                        2 - exibir dados
                        3 - sair
                        """);

                int opcaoMenuPoupanca = sc.nextInt();

                if(opcaoMenuPoupanca == 1) {
                    System.out.print("Digite o valor que se deseja transferir para a conta corrente: R$");
                    double valor = sc.nextDouble();
                    cp.transferir(valor, cc);
                }else if(opcaoMenuPoupanca == 2) {
                    cp.exibirDados();
                }else if(opcaoMenuPoupanca == 3) {
                    break;
                }else {
                    System.out.println("Valor errado, digite novamente!");
                }

            }else if(opcao == 3){
                break;
            }else{
                System.out.println("Opção inválida, Tente novamente!");
            }
        }
    }
}