package questao02;

public class AppLampada1 {
    public static void main(String[] args){
        LampadaTresEstados lampada = new LampadaTresEstados();
            	
        lampada.acender();
        System.out.println(lampada.getEstado());
        
        lampada.apagar();
        System.out.println(lampada.getEstado());
        
        lampada.meiaLuz();
        System.out.println(lampada.getEstado());
        
        lampada.setLuminosidade(61);
        System.out.println(lampada.getEstado());
    }
}
