package questao01;

public class AlunoSuperior extends Aluno {

    public AlunoSuperior(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNivel: Superior";
    }

}
