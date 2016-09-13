package exercicio04;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
       /*String m = JOptionPane.showInputDialog(null,
                               "Qual nome",
                               "Nome",
                               JOptionPane.QUESTION_MESSAGE); 
       JOptionPane.showMessageDialog(null, "Nome: "+m, "Nome Informado", JOptionPane.INFORMATION_MESSAGE);*/
       
       String nome, matricula;
      nome = JOptionPane.showInputDialog(null,
               "Qual nome",
               "Nome",
               JOptionPane.QUESTION_MESSAGE);
       matricula = JOptionPane.showInputDialog(null,
               "Matricula",
               "Digite matricula",
               JOptionPane.QUESTION_MESSAGE);
       
       Aluno a = new Aluno(nome, matricula);
       
       JOptionPane.showMessageDialog(null, a, "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}
