package questao01;
import java.util.ArrayList;
public class AppArrayList {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();
        double soma=0;
        
        notas.add(7.0);
        notas.add(7.0);
        notas.add(7.0);
    
        for(int i=0; i<notas.size(); i++){
            soma += notas.get(i);
        }
        
        double media = soma/notas.size();
        
        System.out.println(media);
    }
}
