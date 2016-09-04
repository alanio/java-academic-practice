package ponto;

public class Gerente extends Funcionario{

    public Gerente(double v) {
        super(v);
    }
    
    @Override
    public void registrarPonto(int h) {        
        if(h>8){
            h -= (h -8);
        }
        super.registrarPonto(h);
    }
    
    @Override
    public double salario() {      
        return getHorasTrabalhadas() * getValorHora();
    }

}
