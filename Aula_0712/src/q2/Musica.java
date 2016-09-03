package q2;

public class Musica {
	private String nome, artista;
	private double duracao;
	
	Musica(String nome, String artista, double duracao){
		this.setNome(nome);
		this.setArtista(artista);
		this.setDuracao(duracao);				
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
}
