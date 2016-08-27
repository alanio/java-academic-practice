package questao05;

import java.util.ArrayList;

public class AlunoArrayList {
    private ArrayList<Double> notas = new ArrayList<Double>(3);
        
    public void adicionarNotas(double valor){               
        if(notas.size() < 3){
            notas.add(valor);
        }else{
            System.out.print("limite de 3 notas atingido\n");
        }
    }
    
    public double calcularMedia(){
        double soma=0;
        for(int i=0; i<notas.size(); i++){            
            soma += notas.get(i);
        }
        return soma/notas.size();
    }
}
