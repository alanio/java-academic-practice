package questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class AppArrayList1 {
    private static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();
        double soma=0;
    
        for(int i=0; i<3; i++){
            notas.add(read.nextDouble());
            soma += notas.get(i);
        }
        
        double media = soma/notas.size();
        
        System.out.println(media);
    }
}
