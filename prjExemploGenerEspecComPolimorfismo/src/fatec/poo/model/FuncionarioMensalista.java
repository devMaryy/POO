
package fatec.poo.model;

/**
 * @author Maria Simões
 */

public class FuncionarioMensalista extends Funcionario{
    
    private double valSalMin, numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dtAdm, double vsm) {
        super(r, n, dtAdm);
        
        valSalMin = vsm;
    }
    
    public void setNumSalMin(double ns) {
        numSalMin = ns;
    }
    
    public double calcSalBruto() {
        return(valSalMin * numSalMin);
    }
}
