package questao4;

public class Empregado{
	String matricula, nome;
	double vlrHoras, qtdHoras, extra, horasCobridas;
	
	Empregado(String matricula, String nome, double vlrHoras){
		this.matricula = matricula;
		this.nome = nome;
		this.vlrHoras = vlrHoras;
		qtdHoras = 0.0;
		extra = 0.0;
		horasCobridas = 0.0;
	}
	
	void registrarPonto(double chegada, double saida){
		double qtdDia = saida - chegada;
		if(qtdDia > 8.0){
			extra  += qtdDia - 8.0;
			qtdHoras += 8;
		}else{
			qtdHoras += qtdDia;
		}
	}
	
	void registrarPonto(double chegada, double saida, double horasCobridas, Empregado destino){
		
		double qtdDia = saida - chegada;
		if(qtdDia > 8.0){
			extra  += (qtdDia - 8.0 - horasCobridas);
			qtdHoras += 8 + horasCobridas;
			transfereHoras(destino, horasCobridas);
		}else{
			qtdHoras += qtdDia;
		}
		
		
		//modo galvao
		/*
		 * code here
		 * 
		 * */
	}
	
	double calcularSalario(){
		double slrNormal = vlrHoras * qtdHoras;
		double slrExtra = (vlrHoras * 1.5) * extra;
		qtdHoras = extra = 0.0;
		return slrNormal + slrExtra;
	}
	
	void transfereHoras(Empregado destino, double horas){
		this.qtdHoras -= horas;
		destino.qtdHoras += horas; 
	}
	
}
