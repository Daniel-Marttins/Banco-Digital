public class ContaCorrente extends Conta {
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    public void imprimirSaldo(){
        System.out.println("== Extrato conta corrente ==");
        super.imprimirExtrato();
    }
}
