package pessoa;

public class Aluno extends Pessoa {
    private String matricula;
    
    public Aluno(int cpf, String nome, String matricula) {
        super(cpf, nome);
        this.matricula = matricula;
    }

    @Override
    public String getArea() {
        return matricula.substring(2,5);
    }
}
