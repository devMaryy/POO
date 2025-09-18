/**
 * @author Maria Simões
 */

package fatec.poo.model;

public class FuncionarioComissionado extends Funcionario {
 
    private double salBase, taxaComissao, totalVendas;
    
    public FuncionarioComissionado(int r, String n, String dt, double tc) {
        super(r, n, dt);
        
        taxaComissao = tc;
    }
    
    public void setSalBase(double s) {
        salBase = s;
    }
    
    public double getSalBase() {
        return(salBase);
    }
    
    public double getTotalVendas() {
        return(totalVendas);
    }
    
    public double getTaxaComissao() {
        return(taxaComissao);
    }
    
    public void addVendas(double av) {
        totalVendas += av;
    }
    
    //APLICANDO POLIMORFISMO, SOBREESCREVENDO (OVERRIDE)
    public double calcSalBruto() {
        return(salBase + taxaComissao * totalVendas);
    }
    
    public double calcGratificacao() {
        if (totalVendas > 5000) {
            if (totalVendas <= 10000) { 
                return(0.03 * totalVendas);
            } else {
                return (0.05 * totalVendas);
            }
        }
        else {
            return(0.0);
        }
    }
    
    //APLICANDO POLIMORFISMO, SOBREESCREVENDO (OVERRIDE)
    public double calcSalLiquido() {
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
