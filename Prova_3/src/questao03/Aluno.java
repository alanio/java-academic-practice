package questao03;

public abstract class Aluno {
	private String nome, matricula;
	private double m1, m2, m3, m4, media;
	
	public Aluno(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	//Metodos Abstratos
	public abstract double getMediaFinal();
	public abstract String getResultado();
	
	//toString
	@Override
	public String toString() {
		return "Matricula: " + matricula +"\nNome: " + nome;
	}
	
	
	//Getter's e Setter's
	public void setMediasBimestrais(double m1, double m2, double m3, double m4){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		setMedia((this.m1 + this.m2 + this.m3 + this.m4)/4);
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getMedia() {
		return media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getM1() {
		return m1;
	}

	public void setM1(double m1) {
		this.m1 = m1;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}

	public double getM4() {
		return m4;
	}

	public void setM4(double m4) {
		this.m4 = m4;
	}
}
