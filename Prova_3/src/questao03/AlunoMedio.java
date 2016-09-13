package questao03;

public class AlunoMedio extends Aluno {

	public AlunoMedio(String nome, String matricula) {
		super(nome, matricula);
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nMedia Final: "+ getMediaFinal() + 
				"\nResultado: "+getResultado() + 
				"\nNivel: Medio";
	}

	@Override
	public String getResultado() {
		if(getMediaFinal() >= 6)
			return "Aprovado";
		else if(getMediaFinal() < 6 && getMediaFinal() >=4)
			return "Prova Final";
		else
			return "Reprovado";
	}
	
	@Override
	public double getMediaFinal() {
		//return (getM1() + getM2() + getM3() + getM4()) / 4;
	    return getMedia();
	}
}
