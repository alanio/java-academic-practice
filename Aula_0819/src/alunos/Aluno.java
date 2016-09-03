package alunos;

public class Aluno{
    private String matricula;
    private double media;

    public Aluno(String matricula, double media) {
        this.setMatricula(matricula);
        this.setMedia(media);
    }
    
    public String resultado(){
        if(media>=7) return "Aprovado";
        if(media<5) return "Reprovado";
        return "Prova Final";
    }
    
    public String toString(){
        return "Matricula:"+getMatricula() +
                "Resultado:"+resultado();
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
}