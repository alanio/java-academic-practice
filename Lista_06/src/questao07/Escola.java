package questao07;

public class Escola {
    private String nome, endereco, niveis;
    private int cod, totalAlunos, totalAlunosEnvolvidos;
    private double ideb;        
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNiveis() {
        return niveis;
    }
    public void setNiveis(String niveis) {
        this.niveis = niveis;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public int getTotalAlunos() {
        return totalAlunos;
    }
    public void setTotalAlunos(int totalAlunos) {
        this.totalAlunos = totalAlunos;
    }
    public int getTotalAlunosEnvolvidos() {
        return totalAlunosEnvolvidos;
    }
    public void setTotalAlunosEnvolvidos(int totalAlunosEnvolvidos) {
        this.totalAlunosEnvolvidos = totalAlunosEnvolvidos;
    }
    public double getIdeb() {
        return ideb;
    }
    public void setIdeb(double ideb) {
        this.ideb = ideb;
    }      
}
