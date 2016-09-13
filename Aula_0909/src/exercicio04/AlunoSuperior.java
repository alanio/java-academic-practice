package exercicio04;

public class AlunoSuperior extends Aluno {
    private String curso;
    
    public AlunoSuperior(String nome, String matricula, String curso) {
        super(nome, matricula);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + getCurso();
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
