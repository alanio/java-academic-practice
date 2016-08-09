package questao07;

public class AppNome {
    public static void main(String[] args) {
        Nome n1 = new Nome();        
        
        final String nome = "Joao da Silva";
        
        System.out.println(n1.getFirstName(nome));
        System.out.println(n1.getLastName(nome));         
        System.out.println(n1.numberOfLetters(nome));
        System.out.println(n1.numberOfNames(nome));
    }
}
