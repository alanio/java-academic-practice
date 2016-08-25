package questao08;

public class Ponto01 {
	private int chegada, saida;
	
	public Ponto01(int chegada, int saida){
		this.chegada = chegada;
		this.saida = saida;
	}
	
	public int getMinutos(){
		return this.saida - this.chegada;
	}
}
