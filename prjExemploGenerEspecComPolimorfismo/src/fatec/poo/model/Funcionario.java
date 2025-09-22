/**
 * @author Maria Simões
 */

package fatec.poo.model;

//CLASSE VIRA ABSTRATA POIS POSSUI PELO MENOS UM MÉTODO ABSTRATO:
public abstract class Funcionario {
    
    private int registro;
    private String nome, dtAdmissao, cargo;
    
    public Funcionario(int r, String n, String dtAdm) {
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    //MÉTODO ABSTRATO, APRESENTA APENAS A ASSINATURA:
    abstract public double calcSalBruto(); 
    
    public void setCargo(String c) {
        cargo = c;
    }
    
    public int getRegistro() {
        return(registro);
    }
    
    public String getNome() {
        return(nome);
    }
    
    public String getDataAdmissao() {
        return(dtAdmissao);
    }
    
    public String getCargo() {
        return(cargo);
    }
    
    public double calcDesconto() {
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido() {
        return(calcSalBruto() - calcDesconto());
    }
}
