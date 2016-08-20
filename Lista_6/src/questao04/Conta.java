package questao04;

public class Conta {
    private double saldo;    
    
    public Conta(double saldo) {      
        this.saldo = saldo;        
    }

    public void deposito(double valor){        
        this.saldo += valor;        
    }
    
    public void saque(double valor){        
        if(valor <= saldo)             
            saldo -= valor;
        else
            System.out.println("Saldo insuficiente");        
    } 
        
    public double getSaldo(){
        return this.saldo;
    }
}
