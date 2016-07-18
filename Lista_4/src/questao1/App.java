package questao1;

public class App {
    public static void main(String[] args){
    	LampadaTresEstados lampada = new LampadaTresEstados();
    	
    	lampada.acender();
    	lampada.apagar();
    	lampada.meiaLuz();
    	
    	System.out.println(lampada.getEstado());
    }
}
