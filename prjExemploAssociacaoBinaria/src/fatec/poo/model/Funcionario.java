package fatec.poo.model;

/**
 *
 * @author Dimas
 */

abstract public class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;  
    private String cargo;
    private Departamento departamento; // Multiplicidade 1 -- Ponteiro: armazena um endereço da classe Departamento
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;  
    }   

    // Tem como parâmetro de entrada o endereço de um objeto da classe Departamento:
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;  
    }
    
    // Retorna o endereço de um objeto da classe Departamento:
    public Departamento getDepartamento() {
        return departamento;  
    }
    
    public int getRegistro(){
        return(registro);
    }
    public String getNome(){
        return(nome);
    }
    public String getDtAdmissao(){
        return(dtAdmissao);
    }
    public String getCargo(){
        return(cargo);
    }
    public void setCargo(String c){
        cargo = c;
    }
    
    public abstract double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
