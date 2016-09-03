package pessoa;

public class Professor extends Pessoa {
    private String formacao;
    
    public Professor(int c, String n, String formacao) {
        super(c,n);
        this.formacao = formacao;
    }
    
    @Override
    public String getArea() {
        return formacao;
    }
}
