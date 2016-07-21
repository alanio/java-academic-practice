package questao10;

public class AppAluno {
	public static void main(String[] args) {
		Aluno al = new Aluno("16lin01");
		
		al.addnota(1);
		al.addnota(2);
		al.addnota(3);
		al.addnota(4);
		al.addnota(5);
		
		System.out.println(al.getMatricula());
		System.out.println(al.getMedia());
	}
}
