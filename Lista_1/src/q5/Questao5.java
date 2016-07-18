/*
 * Um somatório é um operador matemático que nos permite representar facilmente a soma de um
 *	grande número de termos.
*/
package q5;
import java.util.Scanner;

public class Questao5{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		int n, s = 0;
		
		System.out.print("Number: ");
		n = read.nextInt(); 
		
		for(int i=1; i<=n; i++){
			s += i;
		}
		
		System.out.print("Summation = " + s);
	}
}

