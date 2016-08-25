package questao02;

public class Caixa {
    private int numero, senha=0;
    
    Caixa(int numero){
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