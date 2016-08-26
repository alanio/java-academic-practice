package questao02;

import java.util.ArrayList;

public class AppArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> voto = new ArrayList<Integer>();
        int chapa0=0, chapa1=0, branco=0;
        
        voto.add(0);
        voto.add(1);
        voto.add(0);
        voto.add(0);
        voto.add(1);
        voto.add(0);
        voto.add(2);
        voto.add(0);
        voto.add(3);
        voto.add(1);
        
        for(int i=0; i<voto.size(); i++){
            if(voto.get(i) == 0)
                chapa0++;
            else if(voto.get(i) == 1)
                chapa1++;
            else
                branco++;
        }
        
        System.out.println("Chapa 00: "+chapa0);
        System.out.println("Chapa 01: "+chapa1);
        System.out.println("Branco: "+branco);
        
    }
}
