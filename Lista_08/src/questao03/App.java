package questao03;
import java.util.Scanner;
public class App {
    private static Scanner read;

    public static void main(String[] args) {
        read = new Scanner(System.in);
        
        double nota[] = new double[50]; 
        double media;
        int qtd, soma=0;
        
        System.out.print("Total de notas: ");
        
        while(true){
            qtd = read.nextInt();
            if(qtd >= 5){
                for(int i=0; i<qtd; i++){
                    System.out.print("Nota "+ (i+1) + ": ") ;
                    nota[i] = read.nextDouble();
                    soma += nota[i];
                    if(nota[i] == -1)
                        break;
                }
                break;
            }else{
                System.out.print("Minimo de 5 notas: ");
            }                
        }               
                                                
        media = soma/qtd;
              
        System.out.println("\nMedia: "+media);
    }
}
