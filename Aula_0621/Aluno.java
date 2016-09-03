public class Aluno{
	String matricula;
	double media;
	
	void alterarMedia(double valor){
		media = valor;
	}
	
	void exibeResultado(){
		if(media >= 7){
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
		}
	}
}
