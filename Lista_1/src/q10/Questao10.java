package q10;
/*
 * Crie um programa que receba um número e informa se ele é primo ou não.
*/

import java.util.Scanner;

public class Questao10{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		int n, dividers=0;
		
		p("Number: ");
		n = read.nextInt();

		for(int i=1;i<=n;i++){
			if(n %i == 0){
				dividers += 1;
			}
		}

		if(n == 0){
			p("0 is not a prime\n");
		}else if(dividers > 2){
			p("Not prime number\n");
		}else{
			p("Prime number\n");
		}			
	}
	
		//Metodo pra evitar/simplificar repeticao do metodo de impressao
		public static void p(String text){
			System.out.print(text);
		}
}
