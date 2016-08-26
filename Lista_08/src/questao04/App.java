package questao04;
import java.util.Scanner;
public class App {
    private static Scanner read;
    
    public static void main(String[] args) {
        read = new Scanner(System.in);
        int voto[] = new int[100];
        int chapa0=0, chapa1=0, branco=0;
        
        for(int i=0; i<100; i++){
            System.out.print("Nota "+(i+1) + ": ");
            voto[i] = read.nextInt();
            
            if(voto[i] == -1)
                break;
            
            if(voto[i] == 0)
                chapa0++;
            else if(voto[i] == 1)
                chapa1++;
            else
                branco++;
        }

        System.out.println("\nChapa 00: "+chapa0);
        System.out.println("Chapa 01: "+chapa1);
        System.out.println("Branco: "+branco);
        
    }
}
