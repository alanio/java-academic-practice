package questao05;

public class AppHora02 {

	public static void main(String[] args) {
		Hora02 h1 = new Hora02(13);
		Hora02 h2 = new Hora02(15,30);
		
		System.out.println(h1.diferenca(h2));		
	}
}