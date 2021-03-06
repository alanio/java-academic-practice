package questao07;

public class Funcionario {
	private int totalMinutos=0, totalPontos=0;
	private Ponto[] ponto = new Ponto[31];
	
	public void registrarPonto(String chegada, String saida){
		int horaChegada = Integer.parseInt(chegada.substring(0,2)); //quebra a string da hora de chegada e guarda a hora
		int minutoChegada = Integer.parseInt(chegada.substring(3,5)); //quebra a string da hora de chegada e guarda o minuto
		
		int chegadaMinutos = (horaChegada * 60) + minutoChegada; //converte as horas da chegada em minutos e soma com os minutos da chegada
		
		int horaSaida = Integer.parseInt(saida.substring(0,2)); //quebra a string da hora de saida e guarda a hora
		int minutoSaida= Integer.parseInt(saida.substring(3,5)); ////quebra a string da hora de saida e guarda a minuto
		
		int saidaMinutos = (horaSaida * 60) + minutoSaida; //converte as horas da saida em minutos e soma com os minutos da saida
		
		ponto[totalPontos] = new Ponto(chegadaMinutos, saidaMinutos); //cria o ponto informando o o minuto da chegada e o minuto da saida
		totalMinutos += ponto[totalPontos].getMinutos(); //recebe a soma dos minutos de todos os pontos
		totalPontos++; //incremeta o total de pontos criados
		
	}
	
	public int getTotalMinutos(){
		return totalMinutos; //retorna o total de minutos
	}
}
