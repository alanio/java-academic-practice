/* Crie um vetor com as parcelas de um financiamento em que
 * a primeira parcela é total financiado dividido pelo número de
 * parcelas e as demais são valor da parcela anterior
 * incrementado de 1%. O valor financiado e o número de
 * parcela é disponibilizado pelo usuário
*/

import java.util.Scanner;

public class Parcelas{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		double valor;
		int parcelas;
		
		System.out.print("Valor: ");
		valor = read.nextDouble();
		System.out.print("Parcelas: ");
		parcelas = read.nextInt();
		
		double[] vlrParcelas = new double[parcelas];
		
		for(int i=0; i<parcelas; i++){
			if(i==0){
				vlrParcelas[i] = valor/parcelas;
			}else{
				vlrParcelas[i] = vlrParcelas[i-1] * 1.01; 
			}
		}
		
		for(double x : vlrParcelas){
			System.out.println(x);
		}
		
		
	}
}

