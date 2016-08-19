package interfaces;

public class AlunoSuperior extends Aluno{
    String curso;
    
    public String resultado(){
        if(media>=7) return "Aprovado";
        if(media<5) return "Reprovado";
        return "Prova Final";
    }
}
