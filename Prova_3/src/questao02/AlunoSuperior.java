package questao02;

public class AlunoSuperior extends Aluno {

	public AlunoSuperior(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNivel: Superior";
	}

}
