package ponto;

public class Estagiario extends Funcionario {
    
    public Estagiario(double v) {
        super(v);
    }
    
    @Override
    public void registrarPonto(int h) {
        if(h >6){
            setExtra(h-6);
            h -= (h-6);
        }
        super.registrarPonto(h);
    }
    
    @Override
    public double salario() {        
        return getHorasTrabalhadas() * getValorHora();
    }

}
