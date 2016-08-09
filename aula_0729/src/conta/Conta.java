package conta;

public class Conta {
    private static double taxa;
    private double saldo;
    
    public void depositar(double valor){
        this.saldo += valor;
        this.saldo -= (valor*Conta.taxa);
    }
    
    public void sacar(double valor){
        if(valor < (valor*Conta.taxa) + this.saldo){
            this.saldo -= (valor * Conta.taxa);
            this.saldo -= valor;
        }
    }
    
    public static void setTaxa(double taxa){
        Conta.taxa = taxa/100;
    }
    
    public static double getTaxa(){
        return Conta.taxa;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}
