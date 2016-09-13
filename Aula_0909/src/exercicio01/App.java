package exercicio01;
import javax.swing.JOptionPane;;
public class App {

    public static void main(String[] args) {
        /*JOptionPane.showMessageDialog(null, "Alanio");*/
        
        /*JOptionPane.showMessageDialog(null, "Alanio", "Nome", JOptionPane.QUESTION_MESSAGE);*/
        
        /*Aluno a = new Aluno("Aluno", "16INF00");*/
        
        /*JOptionPane.showMessageDialog(null, a, "Aluno", JOptionPane.INFORMATION_MESSAGE);*/
        
        /*String[] sexo = {"Masculino","Feminino"};
        int escolha = JOptionPane.showOptionDialog(null,
                                    "Qual sexo?", 
                                    "Sexo", 
                                    JOptionPane.YES_NO_OPTION, 
                                    JOptionPane.QUESTION_MESSAGE, 
                                    null, 
                                    sexo, 
                                    sexo[0]);
        
        if(escolha == 0)
            JOptionPane.showMessageDialog(null, sexo[0], "Sexo Selecionado", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, sexo[1], "Sexo Selecionado", JOptionPane.INFORMATION_MESSAGE);*/
        
        String[] tipo = {"Superior","Medio", "eee"};
        int escolha = JOptionPane.showOptionDialog(null,
                                    "Qual tipo de aluno?", 
                                    "Tipo de Aluno", 
                                    JOptionPane.YES_NO_OPTION, 
                                    JOptionPane.QUESTION_MESSAGE, 
                                    null, 
                                    tipo, 
                                    tipo[2]);
        
        if(escolha == 0){
            AlunoSuperior a = new AlunoSuperior("Sup", "SUP00INF", "Lic Info");
            JOptionPane.showMessageDialog(null, a, "Dados", JOptionPane.INFORMATION_MESSAGE);
        }else if(escolha == 1){
            AlunoMedio a = new AlunoMedio("Med", "ME00M", "Tec inf");
            JOptionPane.showMessageDialog(null, a, "Dados", JOptionPane.INFORMATION_MESSAGE);
        }
            
    }
}
