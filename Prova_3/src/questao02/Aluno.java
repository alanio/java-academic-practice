package questao02;

public class Aluno {
	private String nome;
	private int matricula;
	private static int novaMatricula=1;
	
	public Aluno(String nome) {
		this.nome = nome;
		matricula = novaMatricula;
		Aluno.novaMatricula++;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int  getMatricula() {
		return matricula;
	}


	@Override
	public String toString() {
		return "Matricula: " + matricula +"\nNome: " + this.nome;
	}
	
}
