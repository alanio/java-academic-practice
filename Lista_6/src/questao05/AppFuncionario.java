package questao05;

public class AppFuncionario {
    public static void main(String[] args) {
        Gerente g = new Gerente("Gerente", 3000, "gerente", "1234");
        Telefonista t = new Telefonista("Telefonista", 2000, 1);
        Secretaria s = new Secretaria("Secretaria", 1000, 1);
        
        System.out.println(g);
        System.out.println("Bonificacao: "+g.bonificacao());
        System.out.println("Gratificacao: "+g.calcularGratificacao());
        System.out.println();
        System.out.println(t);
        System.out.println("Bonificacao: "+t.bonificacao());
        System.out.println();
        System.out.println(s);
        System.out.println("Bonificacao: "+s.bonificacao());
    }
}
