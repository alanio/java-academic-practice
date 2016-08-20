package questao06;

public class AlunoMedio extends Aluno{
    private int serie;

    public AlunoMedio(String nome, int idade, int matricula, double media, int serie) {
        super(nome, idade, matricula, media);
        setSerie(serie);
    }
    
    
    public String resultado(){
        if(getMedia()>=7) return "Aprovado";
        if(getMedia()<5) return "Reprovado";
        return "Prova Final";
    }

    public int getSerie() {
        return serie;
    }
    public void setSerie(int serie) {
        this.serie = serie;
    }
}
