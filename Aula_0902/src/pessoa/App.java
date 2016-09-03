package pessoa;

public class App {

    public static void main(String[] args) {
        Pessoa a = new Aluno(0120102310, "Fulano", "01INF0923");
        System.out.println(a.getArea());
        
        Pessoa p = new Professor(190229129, "Professor", "Informatica");
        System.out.println(p.getArea());        
    }
}
