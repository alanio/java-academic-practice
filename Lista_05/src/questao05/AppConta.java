package questao05;

public class AppConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(100);
        Conta c2 = new Conta(200);        
        
        c1.deposito(100);
        c2.deposito(50);
        
        c1.saque(50);
        c2.saque(30);
        
        System.out.println(c1);
        System.out.println(c2);        
    }
}
