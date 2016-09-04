package empresa;

public class Estagiario extends Funcionario {

    public Estagiario(int matricula, double vencimento) {
        super(matricula, vencimento);
    }
    
    @Override
    public double getGratificacao() {
        return super.getVencimento() * 0.05;
    }

}