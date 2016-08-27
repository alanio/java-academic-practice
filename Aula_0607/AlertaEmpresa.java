class AlertaEmpresa{
	public static void main(String[] args){
		double jan = 15000;
		double fev = 30000;
		double mar = 13000;
		double total = jan + fev + mar;
		System.out.println("Gasto Total do Trimestre: " + total);
		
		if(fev >= jan*2 || mar >= fev*2){
			System.out.println("Alerta\nGastos em excesso!");
		}
		
	}
}
