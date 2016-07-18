/*
 * Crie um programa que calcule a distância entre dois pontos em uma plano cartesiano orientado por
 * (X,Y). Como entrada, o programa deve receber os valores de X e Y de cada ponto.
*/
package q9;
import java.util.Scanner;
import java.lang.Math.*;

public class Questao9{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		double x1,x2,y1,y2;
		double distance;
		
		p("X1: ");
		x1 = read.nextDouble();

		p("Y1: ");
		y1 = read.nextDouble();

		p("X2: ");
		x2 = read.nextDouble();

		p("Y2: ");
		y2 = read.nextDouble();
		
		distance = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
		
		System.out.printf("Distance = %.2f",distance);
	}
	
	//Metodo pra evitar/simplificar repeticao do metodo de impressao
	public static void p(String text){
		System.out.printf(text);
	}
}

