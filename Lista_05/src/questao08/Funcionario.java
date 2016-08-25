package questao08;

public class Funcionario {
    private String matricula;
    private int horas;
    private double  valorHoras;
    private static double ticket=100;
    
    public Funcionario(String matricula, double valorHoras, int horas) {
        this.setMatricula(matricula);
        this.valorHoras = valorHoras;
        this.horas = horas;
    }
    
    public void addHoras(int hora){
        this.horas += hora;
    }
    
    public double salario(){
        return (valorHoras * horas) + ticket;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
