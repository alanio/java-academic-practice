package alunos;

import javax.swing.JOptionPane;

public class App{
    public static Turma turma = new Turma();
    
    public static void main(String[] args) {        
        boolean continuar = true;
        while(continuar){
            int opcao = menuOpcoes();        

            switch(opcao){
                case 1:                    
                    cadastrarAluno();
                    break;
                case 2:
                    exibirAluno();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Programa encerado!", "Click OK para fechar!", JOptionPane.INFORMATION_MESSAGE);
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcao Invalida!", "Selecione uma opcao!", JOptionPane.WARNING_MESSAGE);
                    break;            
            }            
        }
    }
    
    private static int menuOpcoes(){        
        String menu = "\n[1] - Criar Aluno";
        menu += "\n[2] - Exibir Aluno";       
        menu += "\n[3] - Sair";
        
        String strOpcao = JOptionPane.showInputDialog(null,menu,"Menu", JOptionPane.QUESTION_MESSAGE);
        
        return Integer.parseInt(strOpcao);
    }
    
    public static void exibirAluno(){
        String m = JOptionPane.showInputDialog(null, "Digite a matricula", "Pesquisar Aluno", JOptionPane.QUESTION_MESSAGE );
        Aluno a = turma.buscarAluno(m);
        if(a != null){
            JOptionPane.showMessageDialog(null, a, "Pesquisar Aluno", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Aluno Nao Encontrado", "Pesquisar Aluno", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void cadastrarAluno(){
        String matricula = JOptionPane.showInputDialog(null, "Digite a matricula", "Cadastro de Alunos", JOptionPane.QUESTION_MESSAGE );
        String nome = JOptionPane.showInputDialog(null, "Digite o nome", "Cadastro de Alunos", JOptionPane.QUESTION_MESSAGE );
        Aluno a = new Aluno(nome, matricula);
        turma.cadastrarAluno(a);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso", "Cadastro de Alunos", JOptionPane.INFORMATION_MESSAGE);
    }
        
}