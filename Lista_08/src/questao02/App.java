package questao02;

public class App {
    public static void main(String[] args) {
        int voto[] = new int[10];
        int chapa0=0, chapa1=0, branco=0;
        
        voto[0] = 0;
        voto[1] = 1;
        voto[2] = 0;
        voto[3] = 0;
        voto[4] = 1;
        voto[5] = 0;
        voto[6] = 2;
        voto[7] = 0;
        voto[8] = 3;
        voto[9] = 1;
        
        for(int i=0; i<10; i++){
            if(voto[i] == 0)
                chapa0++;
            else if(voto[i] == 1)
                chapa1++;
            else
                branco++;
        }
        
        System.out.println("Chapa 00: "+chapa0);
        System.out.println("Chapa 01: "+chapa1);
        System.out.println("Branco: "+branco);
        
    }
}
