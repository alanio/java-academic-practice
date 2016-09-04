package empresa;

public class Tecnico extends Funcionario{
    public Tecnico(int matricula, double vencimento) {
        super(matricula, vencimento);
    }
    
    @Override
    public double getGratificacao() {
        return super.getVencimento()*0.10;
    }
}