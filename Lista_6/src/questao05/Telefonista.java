package questao05;

public class Telefonista extends Funcionario{
    private int estacao;
    
    public Telefonista(String nome, double vencimento, int estacao) {
        super(nome, vencimento);
        setEstacao(estacao);
       
    }
    
    public String toString(){
        return super.toString() + "\nEstacao: " + getEstacao();
    }

    public int getEstacao() {
        return estacao;
    }

    public void setEstacao(int estacao) {
        this.estacao = estacao;
    }
    
}
