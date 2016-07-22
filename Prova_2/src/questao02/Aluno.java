package questao02;

public class Aluno {
	private String matricula;
	private double[] notas = new double[10];
	private int totalNotas = 0;
	
	
	public Aluno(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public void addNota(double nota){
		notas[totalNotas] = nota;
		totalNotas++;
	}
	
	public double calcularMedia(){
		double soma = 0;
		for(double x: notas){
			soma += x;
		}
		
		return soma/(totalNotas);
	}
	
	
	
	
	
}
