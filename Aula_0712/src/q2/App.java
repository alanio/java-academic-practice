package q2;

public class App {

	public static void main(String[] args) {
		Musica music = new Musica("Orion", "Metallica", 10.3);
		
		print(music.getNome());
		System.out.println( music.getArtista());
		System.out.println( music.getDuracao());

	}
	
	public static void print(String text){
		System.out.println(text);
	}
	
	public static void print(double text){
		System.out.println(text);
	}

}
