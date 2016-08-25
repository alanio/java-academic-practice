package questao07;

public class Supervisor extends Bolsista{
    private Escola escola;
    private int totalIC=0;
    private IniciacaoCientifica[] ic = new IniciacaoCientifica[10];
                
    // Construtor da classe Supervisor com os parametros da super classe e o parametro especifico da classe (escola)
    public Supervisor(int cpf, String nome, int telefone, String email,
                        String termo, String dataIngresso, String curriculoLattes){        
        // Passando os parametros de super classe do construtor Supervisor para a super classe        
        super(cpf, nome, telefone, email, termo, dataIngresso, curriculoLattes);        
    }
    
    public void setEscola(Escola escola){
        this.escola = escola;
    }
    
    public Escola getEscola(){
        return escola;
    }

    public void addIc(IniciacaoCientifica ic) {
        this.ic[totalIC] = ic;
        totalIC++;
    }
    
}
