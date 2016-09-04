package empresa;

public class RH {
    private Funcionario[] funcionarios = new Funcionario[50];
    private int indice=0;
    
    public void criarFuncionario(int m, double v, int tipo){
        if(tipo == 0)
            funcionarios[indice] = new Tecnico(m, v);
        if(tipo == 1)
            funcionarios[indice] = new Analista(m, v);
        if(tipo == 2)
            funcionarios[indice] = new Gerente(m, v);
        if(tipo == 3)
            funcionarios[indice] = new Estagiario(m, v);
        if(tipo == 4)
            funcionarios[indice] = new Bolsista(m, v);
        indice++;
    }
    
    public Funcionario buscarFuncioanrio(int m){
        for(int i=0; i<indice; i++)
            if(funcionarios[i].getMatricula() == m)
                return funcionarios[i];
        
        /*for(Funcionario f:funcionarios)
            if(f.getMatricula() == m)
                return f;*/ 
        return null;
    }
    
    public double salario(int m){
        Funcionario f = buscarFuncioanrio(m);
        
        if(f != null)
            return f.getSalario();
        
        return 0;
    }
    
    public double getFolhaPagamento(){
        double totalPagamentos=0.0; 
        for(int i=0; i<indice; i++)
            totalPagamentos += funcionarios[i].getSalario();        
        
        /*for(Funcionario f:funcionarios){
            totalPagamentos += f.getSalario();
        }*/
        
        return totalPagamentos;     
    }
}