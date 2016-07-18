/*
 * Receba novamente os 13 salários do funcionário e agora
 * informa a sua renda em cada trimestre do ano
*/

import java.util.Scanner;

public class SalarioTrimestre{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		double[] salario = new double[13];
				
		for(int i=0; i<salario.length; i++){
			System.out.print((i+1) + "º Salario: ");
			salario[i] = read.nextDouble();
		}
		
		double trimestre1 = 0.0, trimestre2 = 0.0, trimestre3 = 0.0, trimestre4 = 0.0;
		
		for(int i=0; i<3; i++){
			trimestre1 += salario[i];
		}
		
		for(int i=3; i<6; i++){
			trimestre2 += salario[i];
		}
		
		for(int i=6; i<9; i++){
			trimestre3 += salario[i];
		}
		
		for(int i=9; i<12; i++){
			trimestre4 += salario[i];
		}
		
		System.out.println("\n1º Trimestre = " + trimestre1);
		System.out.println("2º Trimestre = " + trimestre2);
		System.out.println("3º Trimestre = " + trimestre3);
		System.out.println("4º Trimestre = " + trimestre4);

	}
}
