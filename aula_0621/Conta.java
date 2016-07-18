
public class Conta{
	double saldo;
	
	void deposito(double valor){
		saldo = saldo + valor;
	}
	
	void saque(double valor){
		saldo = saldo -valor;
	}
	
	double informarSaldo(){
		return saldo;
	}
}
