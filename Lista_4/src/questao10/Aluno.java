package questao10;

public class Aluno {
	private String matricula;
	private int totalNotas=0;
	private double[] nota = new double[10];
	
	public Aluno(String matricula){
		this.matricula = matricula;
	}
	
	public void addnota(double nota){
		this.nota[totalNotas] = nota;
		totalNotas++;
	}
	
	public double getMedia(){
		double soma=0;
		for(double x: nota){
			soma += x;
		}
		return soma/totalNotas;
	}
	
	public String getMatricula(){
		return matricula;
	}
}
