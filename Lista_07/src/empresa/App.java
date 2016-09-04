package empresa;

public class App {

    public static void main(String[] args) {
        Funcionario tecnico = new Tecnico(1, 2000);
        Funcionario analista = new Analista(2, 3000);
        Funcionario gerente = new Gerente(3, 4000);
        
    
        System.out.println(tecnico);
        System.out.println(analista);
        System.out.println(gerente);
        
        RH rh = new RH();
        rh.criarFuncionario(1, 1000, 0);
        rh.criarFuncionario(2, 2000, 1);
        rh.criarFuncionario(3, 3000, 2);
        rh.criarFuncionario(4, 800, 3);
        rh.criarFuncionario(5, 700, 4);
        
        System.out.println();
        
        System.out.println(rh.salario(1));
        System.out.println(rh.salario(2));
        System.out.println(rh.salario(3));
        System.out.println(rh.salario(4));
        System.out.println(rh.salario(5));
        
        System.out.println();
        
        System.out.println(rh.getFolhaPagamento());
    }

}