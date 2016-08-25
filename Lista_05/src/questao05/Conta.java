package questao05;

public class Conta {    
    private double saldo;
    private static int numeroGeral=1;
    private int numero;
    
    Conta(double saldoInicial){
        this.saldo = saldoInicial;
        this.numero = Conta.numeroGeral;
        Conta.numeroGeral++;
    }
    
    public void deposito(double valor){
        this.saldo += valor;        
    }
    
    public void saque(double valor){
        if(valor < this.saldo){           
            this.saldo -= valor;
        }
    }
    
    public String toString(){
        return "Conta: "+this.numero+" Saldo: "+this.saldo;
    }
}
