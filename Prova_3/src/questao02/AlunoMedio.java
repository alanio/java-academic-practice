package questao02;

public class AlunoMedio extends Aluno {

	public AlunoMedio(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNivel: Medio";
	}

}
