package banco;

public class ContaPoupanca extends Conta {
	private int numSaques=0;
	
	public ContaPoupanca(int num) {
		super(num);
	}

	
	
	public void saque(double valor){
		if(numSaques % 3 == 0)
			taxa();
		super.saque(valor);
		numSaques++;
	}
	
	public void taxa(){
		super.saque(1);
	}
}
