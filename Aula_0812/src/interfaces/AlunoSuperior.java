package interfaces;

public class AlunoSuperior extends Aluno{
    String curso;
    
    public AlunoSuperior(String curso, String nome, int idade, int matricula, double media) {
        this.curso = curso;
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setMedia(media);
    }
    
    public String resultado(){
        if(getMedia()>=7) return "Aprovado";
        if(getMedia()<5) return "Reprovado";
        return "Prova Final";
    }
}
