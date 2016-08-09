package questao03;

public class AppCaixa01 {
    public static void main(String[] args) {
        Caixa01 cx1 = new Caixa01(1);
        Caixa01 cx2 = new Caixa01(2);
                
        System.out.println(cx1.chamarProximo());
        System.out.println(cx2.chamarProximo());
        System.out.println(cx1.chamarProximo());                
        System.out.println(cx2.chamarProximo());        
        System.out.println(cx2.chamarProximo());    
    }
    
}

