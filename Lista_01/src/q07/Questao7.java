/*
 * Faça um programa que receba o nome e 3 notas de um aluno e ao final informe o nome do aluno e
 * se ele está aprovado, reprovado ou de prova final. 
*/
package q07;
import java.util.Scanner;

public class Questao7{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		double n1, n2, n3, m;
		
		p("Note 1: ");
		n1 = read.nextDouble(); 
		
		p("Note 2: ");
		n2 = read.nextDouble(); 
		
		p("Note 3: ");
		n3 = read.nextDouble(); 
		
		m = (n1+n2+n3)/3.0;	
		
		if(m >= 7.0){
			p("Approved\n");
		}else if(m >= 4.0){
			p("Final Test\n");
		}else { //if(m < 6.0)
			p("Disapproved\n");
		}		
	}
	
	//Metodo pra evitar/simplificar repeticao do metodo de impressao
	public static void p(String text){
		System.out.print(text);
	}
}

