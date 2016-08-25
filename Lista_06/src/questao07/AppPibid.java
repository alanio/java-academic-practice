package questao07;

public class AppPibid {
    public static void main(String[] args) {
        Coordenador c = new Coordenador(1, "C", 123, "email", "termo", "data", "curriculo");
        Supervisor s = new Supervisor(1, "C", 123, "email", "termo", "data", "curriculo");
        IniciacaoCientifica ic = new IniciacaoCientifica(1, "C", 123, "email", "termo", "data", "curriculo", "matricula");
        IniciacaoCientifica ic2 = new IniciacaoCientifica(1, "C", 123, "email", "termo", "data", "curriculo", "matricula");
        DadosBancarios db = new DadosBancarios();
        Escola e = new Escola();        
        
        s.addIc(ic);
        s.addIc(ic2);
        s.setEscola(e);
        s.setDadosBancarios(db);        
        
    }
}
