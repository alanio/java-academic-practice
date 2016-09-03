package caixa;

public class App {
	public static void main(String[] args) {
		Caixa cx1 = new Caixa(1);
				
		System.out.println(cx1.chamarProximo());
		System.out.println(cx1.chamarProximo());
		System.out.println(cx1.chamarProximo());				
		cx1.zerarSenha();
		System.out.println(cx1.chamarProximo());
		
		Caixa cx2 = new Caixa(2);
		System.out.println(cx2.chamarProximo());	
    }
	
}
