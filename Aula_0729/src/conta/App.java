package conta;

public class App {
    public static void main(String[] args) {
        Conta.setTaxa(1);
        Conta c = new Conta();
        c.depositar(1000);
        
        System.out.println(c.getSaldo());
        c.sacar(100);
        System.out.println(c.getSaldo());
    }
}
