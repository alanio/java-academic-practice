package alunos;

public class Turma {
    private Aluno[] aluno = new Aluno[50];
    private int tam=0;
    
    public void cadastrarAluno(Aluno aluno){
        this.aluno[tam] = aluno;
        tam++;
    }
    
    public Aluno buscarAluno(String matricula){                
        for(int i=0; i<tam;i++){
            if(matricula.equals(aluno[i].getMatricula())){
                return aluno[i];
            }
        }        
        return null;
    }
    
}
