package questao07;

public class Coordenador extends Bolsista{   
    // Construtor da classe Coordenador com os parametros da super classe e o parametro especifico da classe (matricula)
    public Coordenador(int cpf, String nome, int telefone, String email,
                        String termo, String dataIngresso, String curriculoLattes) {
        // Passando os parametros de super classe do construtor Coordenador para a super classe        
        super(cpf, nome, telefone, email, termo, dataIngresso, curriculoLattes);
        
        // Passando o parametro especifico da classe para o construtor Coordenador
        // Considerando que matricula nao podera ser modificada apos um objeto ser criado, nao ha metodo setter        
    }
}
