package questao2;

public class App{
	public static void main(String args[]){
		
		Empregado emp02 = new Empregado("1602002","Maria",50.0);
		emp02.registrarPonto(8,20);
		emp02.registrarPonto(9,12);
		emp02.registrarPonto(10,13);
		
		print("Salario: " + emp02.calcularSalario());
		print("\nSalario: " + emp02.calcularSalario());					
	}
	
	public static void print(String text){
		System.out.print(text);
	}
}
