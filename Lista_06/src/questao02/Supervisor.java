package questao02;

public class Supervisor extends Bolsista{
    private String escola;
        
    // Construtor da classe Supervisor com os parametros da super classe e o parametro especifico da classe (escola)
    public Supervisor(int cpf, String nome, int telefone, String email,
            String termo, String dataIngresso, String curriculoLattes, String escola) {
        
        // Passando os parametros de super classe do construtor Supervisor para a super classe        
        super(cpf, nome, telefone, email, termo, dataIngresso, curriculoLattes);
        
        // Passando o parametro especifico da classe para o construtor Supervisor        
        setEscola(escola);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
