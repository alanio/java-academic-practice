package questao05;

public class Gerente extends Funcionario{
    private String usuario;
    private String senha;

    public Gerente(String nome, double vencimento, String usuario, String senha) {
        super(nome, vencimento);
        setUsuario(usuario);
        setSenha(senha);        
    }
    
    public String toString(){
        return super.toString() + "\nUsuario: " + getUsuario();
    }
    
    public double calcularGratificacao(){
        double gratificacao = (getVencimento() + bonificacao()) * 0.10;
        return gratificacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
