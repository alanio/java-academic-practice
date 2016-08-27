package questao06;

public class App {
    public static void main(String[] args) {
        AlunoArrayList2 a = new AlunoArrayList2();
        
        a.adicionarNotas(6);
        a.adicionarNotas(6);
        a.adicionarNotas(6);                        
        a.adicionarNotas(6);
        a.adicionarNotas(6);
        a.adicionarNotas(7);
        
        System.out.println(a.calcularMedia());
    }
}
