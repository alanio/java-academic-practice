package questao02;

public class Bolsista {
    private int cpf;
    private String nome;
    private int telefone;
    private String email;
    private String termo;
    private String dataIngresso;
    private String curriculoLattes;
    
    public Bolsista(int cpf, String nome, int telefone, String email,
            String termo, String dataIngresso, String curriculoLattes) {        
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.termo = termo;
        this.dataIngresso = dataIngresso;
        this.curriculoLattes = curriculoLattes;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getCurriculoLattes() {
        return curriculoLattes;
    }

    public void setCurriculoLattes(String curriculoLattes) {
        this.curriculoLattes = curriculoLattes;
    }        
}
