package exercicio01;

public class Aluno {
    
    private String nome, matricula;
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;                
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+"\nMatricula: " + getMatricula();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }    
}
