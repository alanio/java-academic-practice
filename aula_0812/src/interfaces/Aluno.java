package interfaces;

public class Aluno {
    private String nome;
    private int idade, matricula;
    private double media;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setMedia(double media) {
        this.media = media;
    }
      
    public double getMedia(){
        return media;
    }
}

