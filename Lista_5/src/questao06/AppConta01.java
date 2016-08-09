package questao06;

public class AppConta01 {
    public static void main(String[] args) {
        Conta01.setImposto(1);
        Conta01 c = new Conta01(100);
        c.deposito(100);
        
        System.out.println(c);
     
    }
}
