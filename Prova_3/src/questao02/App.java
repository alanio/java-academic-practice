package questao02;

public class App {

	public static void main(String[] args) {
		/*Aluno a = new Aluno("Pedro");
		Aluno b = new Aluno("Maria");
		System.out.println(a);
		System.out.println("++++++++++++");
		System.out.println(b);*/
		
		Aluno a = new AlunoMedio("Pedro");
		Aluno b = new AlunoSuperior("Maria");
		System.out.println(a);
		System.out.println("++++++++++++");
		System.out.println(b);
	}

}
