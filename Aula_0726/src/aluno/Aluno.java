package aluno;

public class Aluno {
	private static double maiorMedia;
	private String matricula;
	private double media;
	
	Aluno(String matricula, double media){
		this.matricula = matricula;
		this.media = media;
		if(media>maiorMedia){
			maiorMedia = media;
		}
	}
	
	public String toString(){
		return "Matricula:"+matricula+"\nMedia:"+media;
	}
	
	public double getMaiorMedia(){
		return maiorMedia;
	}
	
	
}
