package conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(int num, double saldo) {
        super(num, saldo);
    }
    
    @Override
    public void deposito(double valor) {
        super.deposito(valor - valor*0.01);
    }
    
    @Override
    public void saque(double valor) {
        super.saque(valor + valor*0.01);
    }

}
