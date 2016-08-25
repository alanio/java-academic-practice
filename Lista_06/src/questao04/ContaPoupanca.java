package questao04;

public class ContaPoupanca extends Conta{
    private static double rendimento = 0.01;

    public ContaPoupanca(double saldo) {
        super(saldo);        
    }
    
    public void render(){        
        deposito(getSaldo() * ContaPoupanca.rendimento);
    }

    public double getRendimento() {
        return rendimento;
    }
}
