package conta;

public abstract class Conta {
    private int num;
    private double saldo;
    
   public Conta(int num, double saldo){
       this.num = num;
       this.saldo = saldo;
   }
   
    public void deposito(double valor){
        saldo += valor;
    }
    
    public void saque(double valor){
        if(valor <= saldo)
            saldo -= valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public int getNum(){
        return num;
    }
}
