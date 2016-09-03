package interfaces;

public class AlunoMedio extends Aluno{
    int serie;
    public AlunoMedio(int serie, String nome, int idade, int matricula, double media) {
        this.serie = serie;
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setMedia(media);
    }
    
    public String resultadoFinal(){
        if(getMedia()>=7)
            return "Aprovado";
        else
            return "prova Final";
    }
}
