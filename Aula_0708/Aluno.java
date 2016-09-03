public class Aluno{
	String matricula;
	int falta = 0;
	int trabalhosNE = 0;
	double qualitativo;
	
	Aluno(String matricula){
		this.matricula = matricula;
		qualitativo = 2.0;
	}
	
	void registraFalta(){
		falta++;
	}
	
	void registraTNE(){
		trabalhosNE++;
	}
	
	double informaQualitativo(){
		return qualitativo - (trabalhosNE * 0.1) - (falta * 0.1);
	}
	
	void registrarFaltaEmProva(){
		registraFalta();
		registraTNE();
	}
	
	void receberQualitativoDoAluno(Aluno aluno){
		aluno.qualitativo -= 0.4;
		qualitativo += 0.4;
	}
}
