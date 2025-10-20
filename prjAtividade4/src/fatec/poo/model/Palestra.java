/**
 * @author Maria Simões
 */

package fatec.poo.model;

public class Palestra {
    
    private String data, tema;
    private double valor;
    //private Palestrante palestrante; // Multiplicidade 1 -- Ponteiro: armazena um endereço da classe Palestrante
    private Participante[] participantes; // Multiplicidade 1..* -- Ponteiro matriz: armazena os endereços da classe Participantes
    private int qtdParticipantes;
    
    public Palestra(String tema, double valor, int maxParticipantes) {
        this.tema = tema;
        this.valor = valor;
        this.participantes = new Participante[maxParticipantes];
        this.qtdParticipantes = 0;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return data;
    }

    public String getTema() {
        return tema;
    }

    public double getValor() {
        return valor;
    }
    
    public void addParticipante(Participante p) {
        if (qtdParticipantes < participantes.length) {
            participantes[qtdParticipantes] = p;
            qtdParticipantes++;
        }
    }

    public double calcValorFaturado() {
        double total = 0;
        
        for (int x = 0; x < qtdParticipantes; x++) {
            Participante p = participantes[x];
            double valorPago = valor;
            
            switch (p.getTipo()) {
                case 'E':
                    valorPago -= valor * 0.15;
                    break;
                    
                case 'I':
                    valorPago -= valor * 0.20;
                    break;
                    
                default:
                    break;
            }
            total += valorPago;
        }
        return total;
    }
    
}
