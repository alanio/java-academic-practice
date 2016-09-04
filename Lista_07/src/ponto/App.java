package ponto;

public class App {
    public static void main(String[] args) {
        Funcionario a = new Atendente(10);
        Funcionario g = new Gerente(15);
        Funcionario e = new Estagiario(5);
        
        a.registrarPonto(9);
        g.registrarPonto(8);
        e.registrarPonto(7);
        
        System.out.println(a.salario());
        System.out.println(g.salario());
        System.out.println(e.salario());
    }
}
