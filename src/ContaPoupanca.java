import java.text.Format;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    public void imprimirSaldo(){
        System.out.println("== Extrato conta poupança ==");
        super.imprimirExtrato();
    }
}
