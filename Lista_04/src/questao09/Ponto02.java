package questao09;

public class Ponto02 {
	private int chegada, saida;
	
	public Ponto02(int chegada, int saida){
		this.chegada = chegada;
		this.saida = saida;
	}
	
	public int getMinutos(){
		return this.saida - this.chegada;
	}
}
