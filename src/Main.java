import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente clientes = new Cliente();
        Scanner sc = new Scanner(System.in);

        Conta cc = new ContaCorrente(clientes);
        Conta poupanca = new ContaPoupanca(clientes);

        System.out.println("Digite Seu nome: ");
        String nome = sc.next();
        clientes.setNome(nome);

        cc.imprimirSaldo();
        poupanca.imprimirSaldo();
    }
    
}
