package questao08;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.registrarPonto("10:00", "20:30");
	
		f2.registrarPonto("00:00", "05:00");
		
		System.out.println(f1.getTotalMinutosFormatado());
		System.out.println(f2.getTotalMinutosFormatado());
	}
}
