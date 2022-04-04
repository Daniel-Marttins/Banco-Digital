public abstract class Conta implements Iconta{
    
    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void imprimirSaldo() {

    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }

    @Override
    public void depositar(double valor) {
       saldo += valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

        /**
     * @return int return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return double return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
