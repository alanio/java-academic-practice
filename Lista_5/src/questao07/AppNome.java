package questao07;

public class AppNome {
    public static void main(String[] args) {       
        final String nome = "Joao da Silva";
        
        System.out.println(Nome.getFirstName(nome));
        System.out.println(Nome.getLastName(nome));         
        System.out.println(Nome.numberOfLetters(nome));
        System.out.println(Nome.numberOfNames(nome));
    }
}
