/*
 * Faça um programa que receba um número e informa se o número é divisível por 7 ou não.
*/
package q8;
import java.util.Scanner;

public class Questao8{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		int n;
		
		p("Number: ");
		n = read.nextInt(); 
		
		if(n % 7 == 0){
			p("Is divisible by 7");
		}else{
			p("It's not divisible by 7");
		}
	}
	
	//Metodo pra evitar/simplificar repeticao do metodo de impressao
	public static void p(String text){
		System.out.print(text);
	}
}
