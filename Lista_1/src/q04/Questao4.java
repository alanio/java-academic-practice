/* O fatorial de um número é calculado como n !=1 x 2 x 3 x .. n (Ex: 4! = 1 x 2 x 3 x 4 = 24). Faça
*  um programa que receba um número e informe o seu fatorial.
*/
package q04;
import java.util.Scanner;

public class Questao4{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		int n, f = 1;
		
		System.out.print("Number: ");
		n = read.nextInt(); 
		
		for(int i=1; i<=n; i++){
			f *=i;
		}
		
		System.out.print("Factorial = " + f);
	}
}
 
