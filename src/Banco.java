import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    /**
     * @return List<Conta> return the contas
     */
    public List<Conta> getContas() {
        return contas;
    }

    /**
     * @param contas the contas to set
     */
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
