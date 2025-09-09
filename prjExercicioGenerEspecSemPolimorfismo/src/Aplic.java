/**
 * @author Maria Simões
 */

import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

public class Aplic {

    public static void main(String[] args) {
        
        //TRABALHANDO COM DADOS CONSTANTES
        Instrutor objIns = new Instrutor(2832, "Pietro Cabral", "(15)99127-1985");
        
        Cliente objCli = new Cliente("235.766.489-18", "Olívia Ramos", "(15)98767-1346");
        
        objIns.setAreaAtuacao("Astronomia");
        objCli.setPeso(56.45);
        objCli.setAltura(1.67);
        
        System.out.println("\nInformações do Instrutor\n");
        System.out.println("Identificação: " + objIns.getIdentificacao());
        System.out.println("Nome: " + objIns.getNome());
        System.out.println("Telefone: " + objIns.getTelefone());
        System.out.println("Área de atuação: " + objIns.getAreaAtuacao());
        
        System.out.println("\n\nInformações do Cliente\n");
        System.out.println("CPF: " + objCli.getCpf());
        System.out.println("Nome: " + objCli.getNome());
        System.out.println("Telefone: " + objCli.getTelefone());
        System.out.println("Peso: " + objCli.getPeso() + " Kg");
        System.out.println("Altura: " + objCli.getAltura() + " m");
        
    }
    
}
