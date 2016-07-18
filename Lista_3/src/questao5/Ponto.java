package questao5;

public class Ponto{
	int dia;
	double chegada, saida;
	
	Ponto(int d, double c, double s){
		dia = d;
		chegada = c;
		saida = s;
	}
	
	double calcularHorasNormais(){
		return saida - chegada;
	}
	
	double calcularHorasExtras(){
		return saida - chegada - 8;
	}
}
