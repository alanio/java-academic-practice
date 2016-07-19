package questao01;

public class AppLampada {
    public static void main(String[] args){
    	LampadaTresEstados lampada = new LampadaTresEstados();
    	
    	lampada.acender();
    	lampada.apagar();
    	lampada.meiaLuz();
    	
    	System.out.println(lampada.getEstado());
    }
}
