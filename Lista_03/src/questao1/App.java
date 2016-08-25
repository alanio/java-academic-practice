package questao1;

public class App{
	public static void main(String args[]){
		//Questao 1
		Empregado emp01 = new Empregado("1602001","Joao",10.0);
		emp01.registrarPonto(13,18);
		emp01.registrarPonto(13,18);
		
		print("Salario: " + emp01.calcularSalario());
		print("\nSalario: " + emp01.calcularSalario());				
	}
	
	public static void print(String text){
		System.out.print(text);
	}
}
