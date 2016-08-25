package questao2;

public class Empregado{
	String matricula, nome;
	double vlrHoras, qtdHoras, extra;
	
	Empregado(String matricula, String nome, double vlrHoras){
		this.matricula = matricula;
		this.nome = nome;
		this.vlrHoras = vlrHoras;
		qtdHoras = 0.0;
		extra = 0.0;		
	}
	
	void registrarPonto(double chegada, double saida){
		double qtdDia = saida - chegada;
		if(qtdDia > 8){
			extra  += (qtdDia - 8);
			qtdHoras += 8;
		}else{
			qtdHoras += qtdDia;
		}
	}
	
	double calcularSalario(){
		double slrNormal = vlrHoras * qtdHoras;
		double slrExtra = (vlrHoras * 1.5) * extra;
		qtdHoras = extra = 0.0;
		return slrNormal + slrExtra;
	}
	

}
