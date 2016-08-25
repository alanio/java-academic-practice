package questao03;

public class Hora {
	private int hora, minuto;
	
	public Hora(){
		this(0,0);
	}
	
	public Hora(int hora){
		this(hora, 0);
	}
	
	public Hora(int hora, int minuto){
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
	
	@Override
	public String toString(){
		if(this.hora < 10 && this.minuto < 10){					
			return "0" + this.hora + ":" + "0" + this.minuto;
		}else if(this.hora < 10 && this.minuto >= 10){
			return "0" + this.hora + ":" + this.minuto;
		}else if(this.hora >= 10 && this.minuto < 10){
			return this.hora + ":" + "0" + this.minuto;
		}else{
			return this.hora + ":" +this.minuto;
		}				
	}
}
