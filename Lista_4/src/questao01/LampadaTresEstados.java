package questao01;

public class LampadaTresEstados {
    private String estado;

    public LampadaTresEstados() {
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
