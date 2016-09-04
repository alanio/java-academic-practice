package ponto;

public class Funcionario {
    private double valorHora;
    private int horasTrabalhadas=0;
    private int extra=0;
    
    public Funcionario(double v) {
        valorHora = v;
    }
    
    public void registrarPonto(int h){        
        if(h>8){
            extra += (h - 8);
        }
        horasTrabalhadas =+ h;
    }
    
    public double salario(){
        return horasTrabalhadas * valorHora + (extra * (valorHora * 0.5));
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    
    public void setExtra(int extra) {
        this.extra = extra;
    }
}
