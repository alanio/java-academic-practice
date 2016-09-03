package pessoa;

public abstract class Pessoa {
    private String nome;
    private int cpf;
    
    public Pessoa(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public abstract String getArea();
    
    public String getNome() {
        return nome;
    }
    
    public int getCpf() {
        return cpf;
    }
    
}
