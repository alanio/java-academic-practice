package banco;

public class ContaCorrente extends Conta {
	public ContaCorrente(int num) {
		super(num);
	}

	public void saque(double valor){
		super.saque(valor);
		imposto(valor);		
	}
	
	public void deposito(double valor){
		super.deposito(valor);
		imposto(valor);
	}
	
	public void imposto(double valor){
		saque(valor * 0.01);
	}
}
