package questao03;

public class AppEmpregado {
	public static void main(String[] args) {
		Ponto p1 = new Ponto(10,22);
		
		//Questao 3a
		int np1 = p1.getHorasNormais();
		int ep1 = p1.getHorasExtras();
		
		System.out.println("Ponto 1 normal: " + np1);
		System.out.println("Ponto 1 extra: " + ep1);
		
		//Questao 3e
		Empregado emp = new Empregado("16e1", 10);
		emp.registrarPonto(10, 19);
		emp.registrarPonto(13, 18);
		
		System.out.println("Empregado: " + emp.getMatricula() + "\nSalario: " + emp.getSalario());
		
		
	}
}
