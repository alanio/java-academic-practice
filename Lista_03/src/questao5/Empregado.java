package questao5;

public class Empregado{
	String matricula, nome;
	double vlrHoras;
	Ponto pontos[] = new Ponto[31];
	int totalPontos=0;
	
	Empregado(String matricula, String nome, double vlrHoras){
		this.matricula = matricula;
		this.nome = nome;
		this.vlrHoras = vlrHoras;
	}
	
	void registrarPonto(int dia, double chegada, double saida){
		pontos[totalPontos] = new Ponto(dia,chegada,saida);
		totalPontos++;
	}
	
	
	double calcularSalario(){
		double salario=0.0;
		
		for(int i=0;i<totalPontos;i++){
			if(pontos[i].calcularHorasExtras() > 0){
				salario += (pontos[i].calcularHorasNormais() * vlrHoras) + (pontos[i].calcularHorasExtras() * vlrHoras);
			}else{
				salario += (pontos[i].calcularHorasNormais() * vlrHoras);
			}			
		}
		
		zeraPontos();
		totalPontos = 0;
		return salario;
	}
	
	void transfereHoras(Empregado destino, double vlrhoras){
		this.vlrHoras -= vlrHoras;
		destino.vlrHoras += vlrHoras; 
	}
	
	void zeraPontos(){
		for(int i=0;i<totalPontos;i++){
			pontos[i] = null;
		}
	}
	
}
