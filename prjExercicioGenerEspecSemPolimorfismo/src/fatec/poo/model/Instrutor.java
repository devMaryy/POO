/**
 * @author Maria Simões
 */

package fatec.poo.model;

public class Instrutor extends Pessoa{
    
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int id, String n, String tel) {
        super(n, tel);
        
        identificacao = id;
    }
    
    public void setAreaAtuacao(String a) {
        areaAtuacao = a;
    }
    
    public int getIdentificacao() {
        return(identificacao);
    }
    
    public String getAreaAtuacao() {
        return(areaAtuacao);
    }
}
