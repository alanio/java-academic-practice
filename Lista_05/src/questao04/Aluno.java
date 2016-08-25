package questao04;

public class Aluno {
    private String matricula;
    private double nota;
    private static double maiorNota;
    
    public Aluno(String matricula, double nota){
        this.matricula = matricula;
        this.nota = nota;
        
        if(nota>maiorNota)
            maiorNota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public double getNotaFinal(){
        if(getNota() == Aluno.maiorNota){
            return 10;
        }else{
            return nota/Aluno.maiorNota * 10;
        }
    }

}
