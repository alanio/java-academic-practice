package banco;

public class Conta {
	private int num;
	private double saldo;
	
	public Conta(int num){
		this.num = num;
	}
	
	public void deposito(double valor){
		saldo += valor;
	}
	
	public void saque(double valor){
		if(valor <= saldo){
			saldo -= valor;
		}else{
			System.out.print("Saldo insuficiente");
		}
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public int getNum(){
		return num;
	}
}
