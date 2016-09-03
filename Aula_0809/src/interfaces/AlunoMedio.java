package interfaces;

public class AlunoMedio extends Aluno{
    int serie;
    
    public String resultadoFinal(){
        if(media>=7)
            return "Aprovado";
        else
            return "prova Final";
    }
}
