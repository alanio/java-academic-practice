package questao4;

public class App{
	public static void main(String args[]){
		
		Empregado emp05 = new Empregado("1602005","Pedro",50.0);			
		Empregado emp06 = new Empregado("1602006","Juliana",50.0);
				
		emp05.registrarPonto(8,20,4,emp06);
		emp05.registrarPonto(9,12,4,emp06);
		emp05.registrarPonto(10,13,4,emp06);
				
		print("\n" + emp05.nome + "\nSalario: " + emp05.calcularSalario());
		print("\n\n" + emp06.nome + "\nSalario: " + emp06.calcularSalario());	
	}
	
	public static void print(String text){
		System.out.print(text);
	}
}
