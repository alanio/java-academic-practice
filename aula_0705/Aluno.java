public class Aluno{
	String nome, matricula;
	double qualitativo;
	
	Aluno(String nomeA, String matriculaA){
		qualitativo = 2.0;
		nome = nomeA;
		matricula = matriculaA;
	}
	
	Aluno(){
		this("Aluno","00INF000");
	}
		
	void informarFalta(){
		qualitativo -= 0.1;
	}
}

