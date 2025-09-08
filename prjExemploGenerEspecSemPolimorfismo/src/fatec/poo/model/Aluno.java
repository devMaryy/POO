/**
 * @author Maria Simões
 */

package fatec.poo.model;

//EXTENDS: "CRIA" UM VÍNCULO COM A SUPER CLASSE PESSOA
public class Aluno extends Pessoa{
    
    private int regEscolar;
    private double mensalidade; 
    
    public Aluno(int re, String n, String dn) {
        super(n, dn); //CHAMADA DO MÉTODO CONSTRUTOR DA SUPER CLASSE PESSOA
        
        regEscolar = re;
    }
    
    public void setMensalidade(double m) {
        mensalidade = m;
    }
    
    public int getRegEscolar() {
        return(regEscolar);
    }
    
    public double getMensalidade() {
        return(mensalidade);
    }
}
