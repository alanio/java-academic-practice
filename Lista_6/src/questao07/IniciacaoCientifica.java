package questao07;

public class IniciacaoCientifica extends Bolsista {
    private String matricula;

    // Construtor da classe IniciacaoCientifica com os parametros da super classe e o parametro especifico da classe (turma)
    public IniciacaoCientifica(int cpf, String nome, int telefone,
                                String email, String termo, String dataIngresso,
                                String curriculoLattes, String matricula) {
        
        // Passando os parametros de super classe do construtor IniciacaoCientifica para a super classe
        super(cpf, nome, telefone, email, termo, dataIngresso, curriculoLattes);
        
        // Passando o parametro especifico para o construtor IniciacaoCientifica
        setMatricula(matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


}
