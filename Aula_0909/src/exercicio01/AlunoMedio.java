package exercicio01;

public class AlunoMedio extends Aluno {
    private String serie;
    
    public AlunoMedio(String nome, String matricula, String serie) {
        super(nome, matricula);
        this.serie = serie;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSerie: " + getSerie();
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

}
