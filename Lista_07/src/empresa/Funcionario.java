package empresa;

public class Funcionario {
    private double vencimento;
    private int matricula;
    
    public Funcionario(int matricula, double vencimento){
        this.matricula = matricula;
        this.vencimento = vencimento;
    }
    
    public double getGratificacao(){
        return 0.0;
    }
    
    public double getSalario(){
        return vencimento + getGratificacao();
    }
    
    public double getVencimento() {
        return vencimento;
    }
    public void setVencimento(double vencimento) {
        this.vencimento = vencimento;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return "\nMatricula: " +this.getMatricula()+"\nSalario: " + this.getSalario();
    }
}