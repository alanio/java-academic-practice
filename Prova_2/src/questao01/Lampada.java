package questao01;

public class Lampada{
	private String estado;
	
	public Lampada() {
		apagar();
	}
	
	public void apagar(){
		this.estado = "apagada";
	}
	
	public void acender(){
		this.estado = "acesa";
	}
	
	public void meiaLuz(){
		this.estado = "meia-luz";
	}
	
	public String retornaEstado(){
		return estado;
	}
	
}
