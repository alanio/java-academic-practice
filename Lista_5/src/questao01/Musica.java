package questao01;

public class Musica {
    private String nome, artista;
    private double duracao;
    
    Musica(String nome, String artista, double duracao){
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    public String toString(){
        return "Nome: "+getNome()+"\nArtista: "+getArtista()+"\nDuração: "+ getDuracao();
    }
}
