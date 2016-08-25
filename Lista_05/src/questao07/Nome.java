package questao07;

public class Nome {
    public static String getFirstName(String nome){
        String first = nome.substring(0,nome.indexOf(" "));
        return first;
    }
    
    public static String getLastName(String nome){
        String last = nome.substring(nome.lastIndexOf(" ")+1,nome.length());        
        return last;
    }
    
    public static int numberOfLetters(String nome){
        int letters = 0;
        String string[] = nome.split(" ");
        for(String x: string){
            letters += x.length();
        }
        return letters;
    }
    
    public static int numberOfNames(String nome){        
        String words[] = nome.split(" ");
        
        return words.length;
    }
}