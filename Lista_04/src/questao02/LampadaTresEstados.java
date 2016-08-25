/*
 * Generalize a classe LampadaTresEstados para que ela possa representar uma lampada onde a
 * luminosidade pode ser ajustada com qualquer valor entre 0% (apagada) e 100% (acesa). Os
 * metodos antigos devem ser adaptados para as novas exigencias e um novo metodo, que regula a
 * luminosidade, deve ser acrescentado. Teste sua classe criando uma lampada, executando seus
 * metodos de mudanca de luminosidade e exibindo sua luminosidade atual.
 * Atencao:
 * • por padrao, um lampada deve iniciada com apagada (luminosidade 0%).
 * • realize a reutilizacao de metodos na implementacao da classe.
 * 
 */
package questao02;

public class LampadaTresEstados {
    private String estado;
    private int luminosidade;

    public LampadaTresEstados() {
        setLuminosidade(0);
    }
    
    public void apagar() {
    	setLuminosidade(0);
	}
    
    public void acender() {
    	setLuminosidade(100);
	}    
    
    public void meiaLuz() {
    	setLuminosidade(50);
	}    

    public String getEstado() {
            if(getLuminosidade() == 0){
            	estado = "Apagada";
            }else if(getLuminosidade() <= 60){
            	estado = "Meia-Luz";
            }else{
            	estado = "Acesa";
            }
            
            return estado;    	
    }

	public int getLuminosidade() {
		return luminosidade;
	}

	public void setLuminosidade(int luminosidade) {
		if(luminosidade >= 0 && luminosidade <= 100 ){
			this.luminosidade = luminosidade;
		}
			
	}
}
