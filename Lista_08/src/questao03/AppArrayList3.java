package questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class AppArrayList3 {
    private static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {                
        ArrayList<Double> nota = new ArrayList<Double>();
        double media;
        int soma=0;               
        
        for(int i=0; i<5; i++){
            System.out.print("Nota "+ (i+1) + ": ") ;
            nota.add(read.nextDouble());
            
            if(nota.get(i) == -1)
                break;
            
            soma += nota.get(i);                        
        }
                                      
        media =  soma/nota.size();
              
        System.out.println("\nMedia: "+media);
    }
}
