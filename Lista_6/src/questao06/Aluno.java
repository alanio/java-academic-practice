package questao06;

public class Aluno{
    private String nome;
    private int idade, matricula;
    private double media;
    
    public Aluno(String nome, int idade, int matricula, double media) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setMedia(media);
    }

    public String resultado(){
        if(media>=7) return "Aprovado";
        if(media<5) return "Reprovado";
        return "Prova Final";
    }
    
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    } 
}