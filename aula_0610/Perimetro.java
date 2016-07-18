import java.util.Scanner;

public class Perimetro{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		
		double[] lados = new double[4];
		
		p("Lado 1: ");
		lados[0] = read.nextDouble(); 
		
		p("Lado 2: ");
		lados[1] = read.nextDouble(); 
		
		p("Lado 3: ");
		lados[2] = read.nextDouble(); 
		
		p("Lado 4: ");
		lados[3] = read.nextDouble(); 
		
		double perimetro = lados[0] + lados[1] + lados[2] + lados[3];
		p("Perimetro = "+perimetro);				
	}
	
	//Metodo pra evitar/simplificar repeticao do metodo de impressao
	public static void p(String text){
		System.out.print(text);
	}
}

