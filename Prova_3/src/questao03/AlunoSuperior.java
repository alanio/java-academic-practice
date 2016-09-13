package questao03;

public class AlunoSuperior extends Aluno {
	public AlunoSuperior(String nome, String matricula) {
		super(nome, matricula);
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nMedia Final: "+ getMediaFinal() + 
				"\nResultado: "+getResultado() + 
				"\nNivel: Superior";
	}
	

	@Override
	public double getMediaFinal() {
		return getMedia();
	}

	@Override
	public String getResultado() {
		if(getMediaFinal() >= 7)
			return "Aprovado";
		else if(getMediaFinal() < 7 && getMediaFinal() >=4)
			return "Prova Final";
		else
			return "Reprovado";
	}

}
