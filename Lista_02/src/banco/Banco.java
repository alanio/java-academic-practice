package banco;

public class Banco{
	public static void main(String agrs[]){
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		cl1.nome = "Joao";
		cl1.codigo = 1;
		
		cl2.nome = "Maria";
		cl2.codigo = 2;
		
		Agencia ag1 = new Agencia();
		Agencia ag2 = new Agencia();
		
		ag1.nome = "Ag1";
		ag1.numero = 1234;
		
		ag2.nome = "Ag2";
		ag2.numero = 4567;
		
		Conta co1 = new Conta();
		Conta co2 = new Conta();
		
		co1.cliente = cl1;
		co1.agencia = ag1;
		co1.numero = 1;
		co1.saldo = 0.0;
		co1.limite = 5000.0;
		
		co2.cliente = cl2;
		co2.agencia = ag1;
		co2.numero = 2;
		co2.saldo = 0.0;
		co2.limite = 6000.0;
		
		System.out.println("Conta: " + co1.numero + "\nCliente: " + co1.cliente.nome + "\nAgencia: " + co1.agencia.numero);
		System.out.println("\nConta: " + co2.numero + "\nCliente: " + co2.cliente.nome  + "\nAgencia: " + co2.agencia.numero);
	}
}
