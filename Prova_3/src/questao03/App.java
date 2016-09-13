package questao03;

public class App {

	public static void main(String[] args) {
		/*AlunoMedio a = new AlunoMedio("Pedro", "13040");
		a.setMediasBimestrais(9, 8.2, 6.3, 6);
		AlunoSuperior b = new AlunoSuperior("Maria", "13INF98");
		b.setMedia(9);
		System.out.println(a.getMediaFinal());
		System.out.println(b.getMediaFinal());*/
		
		/*AlunoMedio a = new AlunoMedio("Pedro", "13040");
		a.setMediasBimestrais(7, 8.2, 6.3, 6);
		AlunoSuperior b = new AlunoSuperior("Maria", "13INF98");
		b.setMedia(6);
		System.out.println(a.getMediaFinal());
		System.out.println(b.getMediaFinal());
		System.out.println("++++++++++++");
		System.out.println(a.getResultado());
		System.out.println(b.getResultado());*/
		
		Aluno a = new AlunoMedio("Pedro", "13040");
		a.setMediasBimestrais(7, 8.2, 6.3, 6);
		Aluno b= new AlunoSuperior("Maria", "13INF98");
		b.setMedia(6);
		System.out.println(a);
		System.out.println("++++++++++++");
		System.out.println(b);
	}
}
