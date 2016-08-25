package escola;

public class Escola{
	public static void main(String args[]){
		Turma t1 = new Turma();
		Turma t2 = new Turma();
		
		t1.periodo = 1;
		t1.serie = 1;
		t1.sigla = "T1";
		t1.tipo = "TECNICO";
		
		t2.periodo = 2;
		t2.serie = 2;
		t2.sigla = "T2";
		t2.tipo = "SUPERIOR";
		
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		
		al1.nome = "Aluno 1";
		al1.rg = 100100;
		al1.nascimento = "10/01/1995";
		al1.turma = t1;
		
		al2.nome = "Aluno 2";
		al2.rg = 200200;
		al2.nascimento = "01/04/1990";
		al2.turma = t2;
		
		System.out.println("Aluno: " + al1.nome + "\nRG: " + al1.rg + "\nNascimento: " + al1.nascimento + "\nTurma: " + al1.turma.sigla);
		System.out.println("\nAluno: " + al2.nome + "\nRG: " + al2.rg + "\nNascimento: " + al2.nascimento + "\nTurma: " + al2.turma.sigla);
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = "Funcionario 1";
		f1.matricula = "2016f1";
		f1.salario = 2050.0;
		
		f2.nome = "Funcionario 2";
		f2.matricula = "2016f2";
		f2.salario = 2000.0;
		
		System.out.println("\nFuncionario: " + f1.nome + "\nMatricula: " + f1.matricula + "\nSalario: " + f1.salario);
		System.out.println("\nFuncionario: " + f2.nome + "\nMatricula: " + f2.matricula + "\nSalario: " + f2.salario);
		
		
		
		System.out.println("\nPerido da Turma: " + t1.periodo + "\nSerie: " + t1.serie + "\nSigla: " + t1.sigla + "\nTipo: " + t1.tipo);
		System.out.println("\nPerido da turma: " + t2.periodo + "\nSerie: " + t2.serie + "\nSigla: " + t2.sigla + "\nTipo: " + t2.tipo);

	}
}
