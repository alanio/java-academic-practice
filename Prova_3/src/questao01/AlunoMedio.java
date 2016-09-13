package questao01;

public class AlunoMedio extends Aluno {

    public AlunoMedio(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNivel: Medio";
    }

}
