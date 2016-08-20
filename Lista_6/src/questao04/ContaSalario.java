package questao04;

public class ContaSalario extends Conta{    
    private double salario;
    
    public ContaSalario(double saldo, double salario) {
        super(saldo);
        setSalario(salario);
    }
 
    public void depositarSalario(){
        deposito(getSalario());
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
