package questao06;

public class AlunoSuperior extends Aluno{
    private String curso;

    public AlunoSuperior(String nome, int idade, int matricula, double media, String curso) {
        super(nome, idade, matricula, media);
        setCurso(curso);
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
