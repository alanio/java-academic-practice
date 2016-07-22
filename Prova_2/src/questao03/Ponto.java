package questao03;

public class Ponto {
	private int chegada, saida;
	
	public Ponto(int chegada, int saida){
		this.chegada = chegada;
		this.saida = saida;
	}
	
	public int getHorasNormais(){
		int normal = saida - chegada;
		if(normal > 8){
			normal = 8;
		}
		return normal;
	}
	
	public int getHorasExtras(){
		int extra = saida - chegada;
		if(extra > 8){
			extra = extra - 8;	
		}else{
			extra = 0;
		}
		
		return extra;
	}
}
