/*
* Crie um programa que receba dois número inteiros maiores do que zero e retorne o resultado do
* maior número elevado pelo menor número (Ex: 2 e 4 deve retorna 42=16; 3 e 1 deve retorna 31=3).
*/
package q02;
import java.util.Scanner;
import java.lang.Math.*;

public class Questao2{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		int a, b;
		boolean next = true;
		
		while(next == true){
			System.out.print("Number 1: ");
			a = read.nextInt(); 
			
			System.out.print("Number 2: ");
			b = read.nextInt();		
			
			if(a > 0 && b > 0){
				
				if(a>b){
					System.out.print("Result = " + Math.pow(a,b));
				}else if (b>a){
					System.out.print("Result = " + Math.pow(b,a));
				}else{
					System.out.print("Equal Numbers. Result = " + Math.pow(a,a));
				}
				
				next = false;
			
			}else{
				System.out.println("\nType numbers > 0\n");
			}
		}
		
	}
}

