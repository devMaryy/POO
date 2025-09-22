/**
 * @author Maria Simões
 */

package fatec.poo.model;

public class FuncionarioHorista extends Funcionario {
    
    private double valHoraTrab;
    private int qtdeHoraTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, double vht) {
        super(r, n, dtAdm);
        
        valHoraTrab = vht;
    }
    
    public void setQtdeHoraTrab(int qht) {
        qtdeHoraTrab = qht;
    }
    
    //APLICANDO O POLIMORFISMO, SOBREPOSIÇÃO (OVERRIDE) DO MÉTODO:
    public double calcSalBruto() {
        return(valHoraTrab * qtdeHoraTrab);
    }
    
    public double calcGratificacao() {
        return(0.75 * calcSalBruto());
    }
    
    //APLICANDO POLIMORFISMO, SOBREESCREVENDO (OVERRIDE)
    public double calcSalLiquido() {
        return(super.calcSalLiquido() + calcGratificacao()); //CHAMANDO MÉTODO DA SUPER CLASSE, REAPROVEITANDO A PROGRAMAÇÃO
    }
}
