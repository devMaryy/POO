/**
 * @author Maria Simões
 */

package fatec.poo.model;

public class Palestrante extends Pessoa{
    
    private String empresa;
    private double taxaCobranca;
    private Palestra[] palestras; // Multiplicidade 1..* -- Ponteiro Matriz
    private int qtdPalestras;
    
    public Palestrante(String cpf, String nome, String empresa, int maxPalestras) {
        super(cpf, nome);
        this.empresa = empresa;
        this.palestras = new Palestra[maxPalestras];
        this.qtdPalestras = 0;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca / 100;
    }
    
    public double getTaxaCobranca() {
        return taxaCobranca;
    }
    
    public String getEmpresa() {
        return empresa;
    }
    
    public void addPalestra(Palestra p) {
        if (qtdPalestras < palestras.length) {
            palestras[qtdPalestras] = p;
            qtdPalestras++;
        }
    }

    public double calcTotalReceberPalestras() {
        double total = 0;
        
        for (int x = 0; x < qtdPalestras; x++) {
            total += palestras[x].calcValorFaturado();
        }
        return(total * taxaCobranca);
    }    
    
}
