package questao06;

public class Conta01 {    
    private double saldo;
    private int numero;
    private static int numeroGeral=1;
    private static double imposto;
    
    Conta01(double saldoInicial){
        this.saldo = saldoInicial;
        this.numero = Conta01.numeroGeral;
        Conta01.numeroGeral++;
    }
    
    public void deposito(double valor){        
        this.saldo += valor;
        this.saldo -= (valor*Conta01.imposto);
    }
    
    public void saque(double valor){        
        if(valor < (valor*Conta01.imposto) + this.saldo){
            this.saldo -= (valor * Conta01.imposto);
            this.saldo -= valor;
        }
    }
    
    public static void setImposto(double imposto){
        Conta01.imposto = imposto/100;
    }
    
    public String toString(){
        return "Conta: "+this.numero+" Saldo: "+this.saldo;
    }
}
