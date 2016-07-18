package q1;
/*
* Crie um programa que receba dois número inteiros e retorne o maior dos dois números
*/
import java.util.Scanner;

public class Questao1{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Number 1: ");
		a = read.nextInt(); 
		
		System.out.print("Number 2: ");
		b = read.nextInt(); 
		
		if(a>b){
			System.out.print("Bigger = " + a);
		}else if (b>a){
			System.out.print("Bigger = " + b);
		}else{
			System.out.print("Equal Numbers = " + a);
		}
		
		System.out.printf("\n\n%.2f",3.5666);
	}
}
