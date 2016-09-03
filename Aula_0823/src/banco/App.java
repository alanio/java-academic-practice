package banco;

public class App {
	public static void main(String[] args) {
		Banco b = new Banco();
		
		b.criarConta(1, 0);
		
		System.out.println( b.buscarConta(1));
	}
}
