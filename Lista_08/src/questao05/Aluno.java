package questao05;

public class Aluno {
    private double[] notas = new double[3];
    
    public void adicionarNotas(double valor, int posicao){
        notas[posicao] = valor;
    }
    
    public double calcularMedia(){
        double soma=0;
        for(double  n:notas){            
            soma += n;
        }
        return soma/3;
    }
}
