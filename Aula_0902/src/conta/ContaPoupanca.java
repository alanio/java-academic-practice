package conta;

public class ContaPoupanca extends Conta {

    private int numSaques=0;
    
    public ContaPoupanca(int n, double s) {
        super(n, s);
    }
    
    @Override
    public void saque(double valor) {
        numSaques++;
        if(valor < getSaldo())
            super.saque(valor); 
        else{
            System.out.print("Saldo insufuciente");
        }
        
        if(numSaques % 3 == 0){
            if(valor - 1 <= getSaldo())
                super.saque(1);
            else
                System.out.print("Saldo insufuciente");
        }                     
    }
}
