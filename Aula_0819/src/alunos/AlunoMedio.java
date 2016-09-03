package alunos;

public class AlunoMedio extends Aluno{
    private int serie;
    
    public AlunoMedio(String matricula,
            double media, int serie) {
        super(matricula, media);
        setSerie(serie);
    }
    
    public String toString(){
        return "Curso: "+getSerie()+super.toString();
    }
    
    public String resultado(){
        if(getMedia() >=7){
            return "Aprovado";
        }else if(getMedia() >= 6 || getMedia() < 7) {
            return "prova Final";
        }else{
            return "Recuperacao";
        }
    }
    
    public int getSerie() {
        return serie;
    }
    public void setSerie(int serie) {
        this.serie = serie;
    }
}
