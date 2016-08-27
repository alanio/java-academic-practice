package questao06;

import java.util.ArrayList;

public class Aluno {
    private ArrayList<Double>  notas = new ArrayList<Double>();
    
    public void adicionarNotas(double valor){
        notas.add(valor);
    }
    
    public double calcularMedia(){
        double soma=0;
        for(double  n:notas){            
            soma += n;
        }
        return soma/notas.size();
    }
}
