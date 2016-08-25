package questao03;

public class AppHora {

	public static void main(String[] args) {
		Hora h1 = new Hora();
		System.out.println(h1);
		
		Hora h2 = new Hora(1);
		System.out.println(h2);
		
		Hora h3 = new Hora(2,20);
		System.out.println(h3);
		
		h3.alterar(3, 21);
		System.out.println(h3);		
	}

}
