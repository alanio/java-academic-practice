package questao02;

public class AppCaixa {
    public static void main(String[] args) {
        Caixa cx1 = new Caixa(1);
        Caixa cx2 = new Caixa(2);
                
        System.out.println(cx1.chamarProximo());
        System.out.println(cx2.chamarProximo());
        System.out.println(cx1.chamarProximo());                
        System.out.println(cx2.chamarProximo());        
        System.out.println(cx2.chamarProximo());    
    }
    
}

