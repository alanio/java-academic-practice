import java.util.Scanner;

public class App{
	public static void main (String args[]){
		Scanner read = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Musica musica = new Musica();
		
		Aluno aluno1 = new Aluno();
		Musica musica1 = new Musica();
		
		Aluno aluno2 = new Aluno();
		Musica musica2 = new Musica();
		
		aluno.nome = "Aluno";
		aluno.matricula = "20161linf0007";
		aluno.cpf = 000000000;
		
		musica.titulo = "Ska";
		musica.artista = "Paralamas";
		musica.album = "Perfil";
		
		aluno1.nome = "Aluno 1";
		aluno1.matricula = "20161linf0008";
		aluno1.cpf = 0011111111;
		
		musica1.titulo = "Fluorescent Adolescent";
		musica1.artista = "Artic Monkeys";
		musica1.album = "The Best Of";
		
		/*
		aluno2.nome = read.next();
		aluno2.matricula = read.next();
		aluno2.cpf = read.nextInt();
				
		musica2.titulo = read.next();
		musica2.artista = read.next();
		musica2.album = read.next();
		*/
		
		Curso curso = new Curso();
		
		curso.nome = "Informatica";
		curso.nivel = "Superior";
		
		Aluno aluno3 = new Aluno();
		
		aluno3.nome = "Joao";
		aluno3.matricula = "2013INF130";
		aluno3.cpf = 0011111111;
		aluno3.curso = curso;
		
		System.out.println("\nAluno: " + aluno.nome +"\nMusica: " + musica.titulo +
							"\nArtista: " + musica.artista +
							"\nAlbum: " + musica.album);
							
		/*
		System.out.println("\n\nAluno: " + aluno2.nome +"\nMusica: " + musica2.titulo +
							"\nArtista: " + musica2.artista +
							"\nAlbum: " + musica2.album);
		*/ 
							
		System.out.println("\n\nAluno: " + aluno3.nome +"\nCPF: " + aluno3.cpf +
							"\nMatricula: " + aluno3.matricula +
							"\nCurso: " + aluno3.curso.nome);	
							
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		
		p1.x = 10;
		p1.y = 20;
		p2.x = 30;
		p2.y = 5;
				
		Retangulo r = new Retangulo();
		
		r.p1 = p1;
		r.p2 = p2;
		
		System.out.println("\nPonto 1 ("+r.p1.x+","+r.p1.y+")");
		System.out.println("Ponto 2 ("+r.p2.x+","+r.p2.y+")"); 		
					
	}
}
