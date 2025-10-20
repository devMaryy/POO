
import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;
import java.text.DecimalFormat;

/**
 * @author Maria Simões
 */

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        // Palestrante:
        Palestrante palestrante = new Palestrante("12345678900", "Victor Benedict", "TechTalks", 2);
        palestrante.setTaxaCobranca(25); 
        
        // Participantes:
        Participante[] participantes = new Participante[5];
        participantes[0] = new Participante("1010", "Oliver Quinn", 'C');
        participantes[1] = new Participante("2020", "Anne B. Morgan", 'E');
        participantes[2] = new Participante("3030", "Joseph Morgan", 'I');
        participantes[3] = new Participante("4040", "Thea Quinn", 'C');
        participantes[4] = new Participante("5050", "Percy Jackson", 'E');
        
        // Palestras:
        Palestra palestra1 = new Palestra("Inovação em TI", 320.00, 3);
        palestra1.setData("01/09/2025");
        palestra1.addParticipante(participantes[0]);
        palestra1.addParticipante(participantes[1]);
        palestra1.addParticipante(participantes[2]);

        Palestra palestra2 = new Palestra("Futuro da IA", 450.00, 2);
        palestra2.setData("31/12/2025");
        palestra2.addParticipante(participantes[3]);
        palestra2.addParticipante(participantes[4]);
        
        // Associa palestras ao palestrante:
        palestrante.addPalestra(palestra1);
        palestrante.addPalestra(palestra2);
        
        
        System.out.println("CPF Palestrante: " + palestrante.getCpf());
        System.out.println("Nome: " + palestrante.getNome());
        System.out.println("Taxa de Cobrança: " + df.format(palestrante.getTaxaCobranca()) + " %");
        System.out.println("Valor total a receber pelas palestras: " + df.format(palestrante.calcTotalReceberPalestras()));
        
        
    }
    
}
