package questao04;

import java.util.Scanner;
import java.util.ArrayList;

public class AppArrayList {
    private static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> voto = new ArrayList<Integer>();
        int chapa0=0, chapa1=0, branco=0;
        
        for(int i=0; i<100; i++){
            System.out.print("Nota "+(i+1) + ": ");
            voto.add(read.nextInt());
            
            if(voto.get(i) == -1)
                break;
            
            if(voto.get(i) == 0)
                chapa0++;
            else if(voto.get(i) == 1)
                chapa1++;
            else
                branco++;
        }
        
        System.out.println("\nChapa 00: "+chapa0);
        System.out.println("Chapa 01: "+chapa1);
        System.out.println("Branco: "+branco);
        
    }
}
