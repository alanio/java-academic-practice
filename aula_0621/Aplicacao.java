public class Aplicacao{
	public static void main(String[] args){
		Lampada lampada = new Lampada();
		Data data = new Data();
		
		
		
		lampada.acender();
		System.out.println(lampada.estado);
	}
}
