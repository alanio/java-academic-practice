package questao02;

public class AppAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("20161linf19");
		
		aluno.addNota(3);
		aluno.addNota(4);
		aluno.addNota(5);
				
		System.out.println("Aluno: " + aluno.getMatricula() + "\nMedia: " + aluno.calcularMedia());
	}
}
