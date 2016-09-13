package questao01;

public class Aluno {
    private String nome, matricula;

    public Aluno(String nome, String matricula) {
        super();
        this.nome = nome;
        this.matricula = matricula;
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


    @Override
    public String toString() {
        return "Matricula: " + matricula +"\nNome: " + nome;
    }

}
