package questao09;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(10);		
		
		f1.registrarPonto("12:00", "17:00");
		f1.registrarPonto("12:00", "17:00");
		f1.registrarPonto("12:00", "17:00");
		
		System.out.println(f1.getTotalMinutosFormatado());
		System.out.println(f1.calcularSalario());
	}
}