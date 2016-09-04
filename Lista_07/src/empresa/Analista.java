package empresa;

public class Analista extends Funcionario{
    public Analista(int matricula, double vencimento){
        super(matricula, vencimento);
    }
    
    @Override
    public double getGratificacao() {   
        return super.getVencimento() * 0.15;
    }
    
}