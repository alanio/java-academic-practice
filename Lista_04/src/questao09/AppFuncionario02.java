package questao09;

public class AppFuncionario02 {
	public static void main(String[] args) {
		Funcionario02 f1 = new Funcionario02(10);		
		
		f1.registrarPonto("12:00", "17:00");
		f1.registrarPonto("12:00", "17:00");
		f1.registrarPonto("12:00", "17:00");
		
		System.out.println(f1.getTotalMinutosFormatado());
		System.out.println(f1.calcularSalario());
	}
}