package questao1;

public class Empregado{
	String matricula, nome;
	double vlrHoras, qtdHoras;
	
	Empregado(String matricula, String nome, double vlrHoras){
		this.matricula = matricula;
		this.nome = nome;
		this.vlrHoras = vlrHoras;
		qtdHoras = 0.0;
	}
	
	void registrarPonto(double chegada, double saida){
		qtdHoras += (saida - chegada);
	}
		
	double calcularSalario(){
		double salario = vlrHoras * qtdHoras;
		qtdHoras = 0.0;
		return salario;
	}		
}
