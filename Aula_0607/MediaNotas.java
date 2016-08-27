class MediaNotas{
	public static void main(String[] args){
		double n1, n2, n3;
		n1 = 7;
		n2 = 6.5;
		n3 = 6;
		
		double media = (n1 + n2 + n3)/3;
		
		if(media >=7){
			System.out.println("Aprovado: " + media);
		}else{
			System.out.println("Reprovado: " + media);
		}
	}
}
