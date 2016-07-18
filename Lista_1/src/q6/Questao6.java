/*
 * Programa arvore de natal, faça um programa que receba um número inteiro n e imprima a seguinte
 * saída, sendo n o número de estrelas das últimas linha.
*/
package q6;
import java.util.Scanner;

public class Questao6{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		int n;
		
		p("Lines: ");
		n = read.nextInt(); 
		
		for (int i=1; i<=n; i++){
			for (int a=1; a<=i; a++)
				p("*");
			p("\n");
		}						
	}
	
	//Metodo pra evitar/simplificar repeticao do metodo de impressao
	public static void p(String text){
		System.out.print(text);
	}
}
