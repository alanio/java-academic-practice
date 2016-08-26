package questao03;
import java.util.ArrayList;
import java.util.Scanner;

public class AppArrayList {
    private static Scanner read;

    public static void main(String[] args) {
        read = new Scanner(System.in);
        
        ArrayList<Double> nota = new ArrayList<Double>();
        double media;
        int qtd, soma=0;
        
        System.out.print("Total de notas: ");
        while(true){
            qtd = read.nextInt();
            if(qtd >= 5){
                break;
            }else{
                System.out.print("Digite no minimo 5 notas: ");
            }                
        }               
        
        for(int i=0; i<qtd; i++){
            System.out.print("Nota "+ (i+1) + ": ") ;
            nota.add(read.nextDouble());
            soma += nota.get(i);
            if(nota.get(i) == -1)
                break;
        }
                                      
        media =  soma/qtd;
              
        System.out.println("\nMedia: "+media);
    }
}
