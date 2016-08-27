package questao05;

public class App {
    public static void main(String[] args) {
        AlunoArrayList a = new AlunoArrayList();
        
        a.adicionarNotas(6);
        a.adicionarNotas(6);
        a.adicionarNotas(6);                        
        a.adicionarNotas(7);
        a.adicionarNotas(7);
        
        System.out.println(a.calcularMedia());
    }
}
