package br.faesa.grupoestudos.forca;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import javax.swing.JOptionPane;

public class Jogo {
    private int acertos; //referente � quantidade de acertos
    private int erros; //referente � quantidade de erros
    private String segredo; //referente ao segredo a ser descoberto
    private String imagem; //imagem do segredo
    private String palavra; //referente � palavra que est� seno descoberta (segredo auxiliar)
    private VetorPalavraImagem vetor; //referente ao vetor que cont�m as palavras do nivel atual escolhido
    
    //m�todo construtor
    public Jogo (int level)   {
        LeArquivo arquivo = new LeArquivo ();
        try {
            arquivo.openFile("NIVEL"+level+".TXT");
        }
        catch (FileNotFoundException erro){
            JOptionPane.showMessageDialog (null,erro.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
        try {
            this.vetor = arquivo.readFile();
            preparaJogo ();
        }
        catch (NoSuchElementException erro){
            JOptionPane.showMessageDialog (null,erro.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalStateException erro){
            JOptionPane.showMessageDialog (null,erro.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
        catch (ArrayIndexOutOfBoundsException erro){
            JOptionPane.showMessageDialog (null,erro.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception erro){
            JOptionPane.showMessageDialog (null,erro.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //m�todo que retorna o vetor com as palavras
    public VetorPalavraImagem getVetor () {
        return this.vetor;
    }
    
    //m�todo que retorna a qauntidade de erros
    public int getErros () {
        return this.erros;
    }
    
    //m�todo que retorna a quantidade de acertos
    public int getAcertos () {
        return this.acertos;
    }
    
    //m�todo que retorna o segredo (palavra que foi escolhida)
    public String getSegredo () {
        return this.segredo;
    }
    
    //m�todo que retorna a imagem do segredo
    public String getImagem () {
        return this.imagem;
    }
    
    //m�todo que retorna a palavra  - segredo auxiliar
    public String getPalavra () {
        return this.palavra;
    }
    
    //m�todo que verifica se o jogo acabou
    public boolean jogoAcabou () {
        if ((this.erros == 5) || (this.acertos == this.segredo.length())) {
            return true;
        }
        else {
            return false;
        }
    }
    
    //m�todo que prepara o jogo e inicializa as vari�veis fazendo as verifica��es necess�rias
    public void preparaJogo () {
        PalavraImagem forca;
        forca = this.vetor.sorteio();
        this.segredo = forca.getSegredo();
        this.segredo = this.segredo.toUpperCase();
        this.imagem = forca.getFigura();
        this.palavra = "";
        for (int i=0; i<this.segredo.length(); i++){
            this.palavra += " ";
        }
        this.erros  = 0;
        this.acertos = 0;
        for (int i=0; i< segredo.length();i++){
            if (segredo.charAt(i)=='-')
                this.acertos++;
        }
    }   
    
    //m�todo que verifica se tem a letra que o usu�rio digitou considerando os casos especiais (�,�,�,�, etc)
    private boolean temLetra(char letra){
        char[] vetPalavra = new char[palavra.length()];
        boolean temp = false;
        char auxLetra;  
        vetPalavra = this.palavra.toCharArray();
        for (int i = 0; i < this.segredo.length(); i++){
            auxLetra = segredo.charAt(i);
            if (auxLetra == letra){
                temp = atualizaPalavra(vetPalavra, i);              
            }
            else{
                switch (auxLetra){
                case 'Ç' : if (letra == 'C')
                            temp = atualizaPalavra(vetPalavra, i);
                           break;
                case 'Á':
                case 'Â':
                case 'Ã': if (letra == 'A')
                            temp = atualizaPalavra(vetPalavra, i);
                          break;
                case 'É':
                case 'Ê': if (letra == 'E')
                            temp = atualizaPalavra(vetPalavra, i);
                          break;
                case 'Í': if (letra == 'I')
                            temp = atualizaPalavra(vetPalavra, i);
                          break;
                case 'Ó':
                case 'Õ':
                case 'Ô': if (letra == 'O')
                            temp = atualizaPalavra(vetPalavra, i);
                          break;
                case 'Ú':
                case 'Ü': if (letra == 'U')
                            temp = atualizaPalavra(vetPalavra, i);
                          break;
                }
            }
        }
        this.palavra = String.valueOf(vetPalavra);
        return temp;
    }
    
    //m�todo que atualiza a palavra (segredo 2) para que aparec�a para o usu�rio o estado atual da sua descoberta
    private boolean atualizaPalavra (char[] vetPalavra, int ind){
        vetPalavra[ind] = this.segredo.charAt(ind);
        this.acertos++;
        return true;
    }
    
    //m�todo que verifica se tem uma determinada letra na palavra a ser descoberta
    public void acertou (char letra) {
        if (!temLetra(letra)) {
            this.erros++;
        }   
    }
}
