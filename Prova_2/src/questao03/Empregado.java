package questao03;

public class Empregado {
	private String matricula;
	private double valorHora;
	private Ponto[] pontos = new Ponto[31];
	private int totalPontos = 0;
	
	public Empregado(String matricula, double valorHora){
		this.matricula = matricula;
		this.valorHora = valorHora;
	}
	
	public void registrarPonto(int chegada, int saida){
		pontos[totalPontos] = new Ponto(chegada, saida);
		totalPontos++;
	}
	
	public double getSalario(){
		double salarioNormal=0;
		double salarioExtra=0;
		for(int i=0;i<totalPontos;i++){
			salarioNormal += pontos[i].getHorasNormais() * valorHora;
			salarioExtra += pontos[i].getHorasExtras() * valorHora * 1.5;
		}
		
		return salarioNormal + salarioExtra;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
}
