package questao02;

import java.util.ArrayList;
import java.util.Scanner;

public class AppArrayList2 {
    private static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> voto = new ArrayList<Integer>();
        int chapa0=0, chapa1=0, branco=0;
                
        for(int i=0; i<10; i++){
            System.out.print("Voto "+(i+1) +": ");
            voto.add(read.nextInt());
            
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
