package questao1;

public class LampadaTresEstados {
    String estado;

    LampadaTresEstados() {
        apagar();
    }
    
    public void apagar() {
		estado = "apagada";
	}
    
    public void acender() {
		estado = "acesa";
	}    
    
    public void meiaLuz() {
		estado = "meia-luz";
	}    

	public String getEstado() {
		return estado;
	}
}
