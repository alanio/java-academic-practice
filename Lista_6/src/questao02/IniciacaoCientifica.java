package questao02;

public class IniciacaoCientifica extends Bolsista {
    private String turma;

    // Construtor da classe IniciacaoCientifica com os parametros da super classe e o parametro especifico da classe (turma)
    public IniciacaoCientifica(int cpf, String nome, int telefone,
            String email, String termo, String dataIngresso,
            String curriculoLattes, String turma) {
        
        // Passando os parametros de super classe do construtor IniciacaoCientifica para a super classe
        super(cpf, nome, telefone, email, termo, dataIngresso, curriculoLattes);
        
        // Passando o parametro especifico para o construtor IniciacaoCientifica
        setTurma(turma);
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
}
