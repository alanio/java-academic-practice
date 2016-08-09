package questao04;

public class AppAluno {  
    public static void main(String[] args) {
        Aluno a1 = new Aluno("04N01",7);
        Aluno a2 = new Aluno("04N02",8);
        Aluno a3 = new Aluno("04N03",9);
        
        System.out.println(a1.getNotaFinal());
        System.out.println(a2.getNotaFinal());
        System.out.println(a3.getNotaFinal());
    }
}
