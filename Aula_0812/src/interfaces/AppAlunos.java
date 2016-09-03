package interfaces;

public class AppAlunos {
    public static void main(String[] args) {
        AlunoSuperior as1  = new AlunoSuperior("Informatica", "Meu nome", 27, 00123, 7);
        
        System.out.println(as1.resultado());
    }   
}
