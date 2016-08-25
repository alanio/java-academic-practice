package questao07;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.registrarPonto("13:30", "18:30");
		f1.registrarPonto("14:30", "18:00");
		
		f2.registrarPonto("00:01", "05:00");
		f2.registrarPonto("00:00", "05:00");
		
		System.out.println(f1.getTotalMinutos());
		System.out.println(f2.getTotalMinutos());
	}
}
