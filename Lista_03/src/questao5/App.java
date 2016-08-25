package questao5;

public class App{
	public static void main(String args[]){
		Empregado emp01 = new Empregado("1602001","Joao",10.0);
		emp01.registrarPonto(1,12,22);
		emp01.registrarPonto(2,10,14);

				
		print("Salario: " + emp01.calcularSalario());
		print("\nSalario: " + emp01.calcularSalario());
		
	}
	
	public static void print(String text){
		System.out.print(text);
	}
}
