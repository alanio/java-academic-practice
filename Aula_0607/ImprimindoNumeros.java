import java.util.Scanner;

class ImprimindoNumeros{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int num;
		do{
			System.out.println("Digite numero maior que 0: ");
			num = ler.nextInt();
			System.out.print("\n");
			if(num > 0){
				for(int i=1; i<=num; i++){
					System.out.println(i);
				}
			}
		} while(num == 0);
	}
}
