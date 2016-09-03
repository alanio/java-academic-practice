/*
 * Faça um programa que receba os 13 salários de um
 * funcionário durante o ano e calcule a sua renda anual
*/

import java.util.Scanner;

public class Salario{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		double[] salario = new double[13];
				
		for(int i=0; i<salario.length; i++){
			System.out.print((i+1) + "º Salario: ");
			salario[i] = read.nextDouble();
		}
		
		double renda = 0.0;
		
		for(int i=0; i<salario.length; i++){
			renda += salario[i];
		}
		
		System.out.print("Renda = " + renda);
	}
}
