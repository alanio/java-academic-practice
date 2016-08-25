package questao3;

public class App{
	public static void main(String args[]){
		
		Empregado emp03 = new Empregado("1602003","Jose",50.0);
		emp03.registrarPonto(8,20);
		emp03.registrarPonto(9,12);
		emp03.registrarPonto(10,13);
							
		Empregado emp04 = new Empregado("1602004","Marilia",50.0);
		//emp04.registrarPonto(13,21);
				
		emp03.transfereHoras(emp04,4);
		
		print("\n" + emp03.nome + "\nSalario: " + emp03.calcularSalario());
		print("\n\n" + emp04.nome + "\nSalario: " + emp04.calcularSalario());
	}
	
	public static void print(String text){
		System.out.print(text);
	}
}
