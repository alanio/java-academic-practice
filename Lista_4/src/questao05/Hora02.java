package questao05;

import java.lang.Math;

public class Hora02 {
	private int hora, minuto;
	
	public Hora02(){
		this(0,0);
	}
	
	public Hora02(int hora){
		this(hora, 0);
	}
	
	public Hora02(int hora, int minuto){
		this.alterar(hora, minuto);		
	}

	public void alterar(int hora, int minuto){
		if(hora >= 0 && hora <= 23){
			this.hora = hora;
		}
		
		if(minuto >=0 && minuto <= 59){
			this.minuto = minuto;
		}				
	}
	
	public int retornaMinutos(){
		return hora * 60 + minuto;
	}
	
	public int diferenca(Hora02 hora){
		int diff = ((this.hora - hora.hora) * 60) + (this.minuto - hora.minuto);		
		diff = Math.abs(diff);
		
		return diff;
	}
	
	@Override
	public String toString(){
		if(this.hora < 10 && this.minuto < 10){					
			return "0" + this.hora + ":" + "0" + this.minuto;
		}else if(this.hora < 10 && this.minuto >= 10){
			return "0" + this.hora + ":" + this.minuto;
		}else if(this.hora >= 10 && this.minuto < 10){
			return this.hora + ":" + "0" + this.minuto;
		}else{
			return this.hora + ":" + this.minuto;
		}				
	}
}
