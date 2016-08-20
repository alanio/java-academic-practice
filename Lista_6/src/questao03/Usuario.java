package questao03;

public class Usuario {
    private String nome;
    private int cpf;
    private String email;
    private int telefone;
    private String endereco;
    
    public Usuario(String nome, int cpf, String email, int telefone,
            String endereco) {        
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setTelefone(telefone);
        setEndereco(endereco);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }        
}
