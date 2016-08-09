package questao03;

public class Caixa01 {
    private int numero;
    private static int senha=0;
    
    Caixa01(int numero){
        this.numero = numero;
    }
    
    public void zerarSenha(){
        senha = 0;
    }
    
    public String chamarProximo(){
        senha++;
        return "Senha:" + senha + " - Caixa:" + numero;
    }
}