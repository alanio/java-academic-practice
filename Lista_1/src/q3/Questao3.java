/* O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa
*  está no peso ideal. Seu cálculo é feito através da fórmula e da tabela abaixo:
*  Sabendo disso, faça um programa que receba a massa e a altura de uma pessoa e informe a sua
*  classificação de acordo com o IMC.
*/
package q3;
import java.util.Scanner;

public class Questao3{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		double h, w, imc;
		
		p("Weight: ");
		w = read.nextDouble();
		
		p("Height: ");
		h = read.nextDouble();
		
		imc = w/(h*h);
		
		if(imc > 0.0){
			
			if(imc < 16.0){
				p("Magreza grave\n");
			}else if(imc < 17.0){
				p("Magreza moderada\n");
			}else if(imc < 18.5){
				p("Magreza leve\n");
			}else if(imc < 25){
				p("Saudavel\n");
			}else if(imc < 30){
				p("Sobrepeso\n");
			}else if(imc < 35){
				p("Obesidade Grau I\n");
			}else if(imc < 40){
				p("Obesidade Grau II (severa)\n");
			}else {
				p("Obesidade Grau III (mórbida)\n");
			}
			
			p("IMC " + imc);
			
		}else{
			p("\nInvalid IMC\n");
		}
	}
	
	//Metodo pra evitar/simplificar repeticao do metodo de impressao
	public static void p(String text){
		System.out.print(text);
	}
}
