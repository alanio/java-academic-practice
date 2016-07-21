package questao09;

public class Ponto {
	private int chegada, saida;
	
	public Ponto(int chegada, int saida){
		this.chegada = chegada;
		this.saida = saida;
	}
	
	public int getMinutos(){
		return this.saida - this.chegada;
	}
}
