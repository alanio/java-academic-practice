package alunos;

public class AlunoSuperior extends Aluno{
    private String curso;
    
    public AlunoSuperior(String matricula,
            double media, String curso) {
        super(matricula, media);
        setCurso(curso);
    }
    
    public String toString(){
        return "Curso: "+getCurso()+super.toString();
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
