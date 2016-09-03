public class Data{
	int dia, mes, ano;
	
	int dias(){
		return dia + (mes*30) + (ano*365);
	}
}
