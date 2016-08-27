package questao06;

import java.util.ArrayList;

public class AlunoArrayList2 {
    private ArrayList<Double> notas = new ArrayList<Double>(5);
    
    public void adicionarNotas(double valor){
        if(notas.size() < 5){
            notas.add(valor);
        }else{
            System.out.print("limite de 5 notas atingido\n");
        }
    }
    
    public double calcularMedia(){
        double soma=0;
        for(double  n:notas){            
            soma += n;
        }
        return soma/5;
    }
}
