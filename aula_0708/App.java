public class App{
	public static void main(String args[]){
		Aluno aluno = new Aluno("14INF001");
		//aluno.registraFalta();
		//aluno.registraFalta();
		//aluno.registraTNE();
		aluno.informaQualitativo();
				
		Aluno alunoB = new Aluno("14INF002");
		//alunoB.registraFalta();
		//alunoB.trabalhosNE = 1;
		//alunoB.registrarFaltaEmProva();
		alunoB.receberQualitativoDoAluno(aluno);
		
		System.out.print("Matricula: " + aluno.matricula +
							"\nFaltas: " + aluno.falta +
							 "\nTrabalhos nao entregues: " + aluno.trabalhosNE  +
							  "\nQualitativos: " + aluno.informaQualitativo());
							  
		System.out.println("\n\nMatricula: " + alunoB.matricula +
							"\nFaltas: " + alunoB.falta +
							 "\nTrabalhos nao entregues: " + alunoB.trabalhosNE  +
							  "\nQualitativos: " + alunoB.informaQualitativo());
	}
}
