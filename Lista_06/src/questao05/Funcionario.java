package questao05;

public class Funcionario {
    private String nome;
    private double vencimento;
    
    
    public Funcionario(String nome, double vencimento) {
        this.nome = nome;
        this.vencimento = vencimento;
    }
    
    public String toString(){
        return "Nome: "+nome+"\nSalario: "+vencimento;
    }
    
    protected double bonificacao(){
        double bonus = vencimento * 0.10;
        //vencimento += bonus;
        return bonus;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVencimento() {
        return vencimento;
    }
    public void setVencimento(double vencimento) {
        this.vencimento = vencimento;
    }
}
