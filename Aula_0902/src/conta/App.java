package conta;

public class App {

    public static void main(String[] args) {
        Conta p = new ContaPoupanca(1, 100);
        Conta c = new ContaCorrente(2, 100);
        
        p.saque(10);
        p.saque(10);
        p.saque(10);
        
        System.out.println(p.getSaldo());
        
        c.saque(10);
        c.deposito(10);
        System.out.println(c.getSaldo());
    }

}
