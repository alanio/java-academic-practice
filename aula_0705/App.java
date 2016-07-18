import java.util.Scanner;

public class App{
	public static void main (String args[]){
		Scanner read = new Scanner(System.in);
		Aluno aluno = new Aluno("Joao","14INF123");
		Aluno alunoA = new Aluno();
			
		aluno.informarFalta();
		aluno.informarFalta();
		
		alunoA.informarFalta();
		
		System.out.printf("Matricula: " + aluno.matricula + "\nQualitativos: %.2f\n", aluno.qualitativo);	
		System.out.printf("\nMatricula: " + alunoA.matricula + "\nQualitativos: %.2f", alunoA.qualitativo);

	}
}
