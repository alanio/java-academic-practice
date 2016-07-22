package questao01;

public class AppLampada {
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.acender();
		System.out.println(lampada.retornaEstado());
		
		lampada.meiaLuz();
		System.out.println(lampada.retornaEstado());
	}
}
