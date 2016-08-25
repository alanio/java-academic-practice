package questao01;

public class App {
    public static void main(String[] args) {
        double notas[] = new double[3];
        double media;
        int soma=0;
        
        notas[0] = 7;
        notas[1] = 7;
        notas[2] = 7;
        
        for(int i=0; i < 3; i++){
            soma += notas[i]; 
        }
        
        media = soma/3;
        System.out.println(media);
    }
}
