package questao06;

public class Aluno {
    private double[] notas = new double[5];
    private int i=0;
    
    public void adicionarNotas(double valor){
        notas[i] = valor;
        i++;
    }
    
    public double calcularMedia(){
        double soma=0;
        for(double  n:notas){            
            soma += n;
        }
        return soma/3;
    }
}
