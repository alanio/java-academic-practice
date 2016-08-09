package questao07;

public class Nome {
    public String getFirstName(String nome){
        String first = nome.substring(0,nome.indexOf(" "));
        return first;
    }
    
    public String getLastName(String nome){
        String last = nome.substring(nome.lastIndexOf(" ")+1,nome.length());        
        return last;
    }
    
    public int numberOfLetters(String nome){
        int letters = 0;
        String string[] = nome.split(" ");
        for(String x: string){
            letters += x.length();
        }
        return letters;
    }
    
    public int numberOfNames(String nome){        
        String words[] = nome.split(" ");
        
        return words.length;
    }
}