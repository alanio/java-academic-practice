package questao05;

public class Secretaria extends Funcionario{
    private int ramal;
    
    public Secretaria(String nome, double vencimento, int ramal) {
        super(nome, vencimento);
        setRamal(ramal);
    }    
    
    public String toString(){
        return super.toString() + "\nRamal: " + getRamal();
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
