package empresa;

public class Gerente extends Funcionario {
    public Gerente(int matricula, double vencimento){
        super(matricula, vencimento);
    }
    
    @Override
    public double getGratificacao() {
        return super.getVencimento() * 0.20;
    }
}