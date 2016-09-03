package banco;

public class Banco {
    private Conta[] conta = new Conta[30];
    private int pos = 0;

    public void criarConta(int num, int tipo){		
        if(tipo == 0)
            conta[pos] = new ContaCorrente(num);
        if(tipo == 1)
            conta[pos] = new ContaPoupanca(num);		
        pos++;
    }

    /*public Conta buscarConta(int num){
        	for(int i=0; i<=tam; i++){
        		if(num == conta[i].getNum())
        			return conta[i];
        	}
        	return null;
        }*/

    public Conta buscarConta(int num){
        for(Conta c:conta){
            if(num == c.getNum())
                return c;
        }
        return null;
    }
}
