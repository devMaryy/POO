/**
 * @author Maria Simões
 */

import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;

public class Aplic {
     
    public static void main(String[] args) {
        
        //FORMATAR OS VALORES DO OUTPUT:
        //CHAMADA DO MÉTODO CONSTRUTOR
        //MÁSCARA DE FORMATAÇÃO PADRÃO AMERICANO, MAS O FORMAT USA A CONFIGURAÇÃO DO WINDOWS PARA NOSSA REGIÃO COMO PADRÃO 
        //RECEBE VALOR DOUBLE E DEVOLVE UMA STRING
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        FuncionarioHorista funcHora = new FuncionarioHorista(1010, "Luiza Mendes", 
                                                                "19/02/2017", 
                                                                15.80);
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, 
                                                                "Victor Pereira", 
                                                                 "03/06/2018", 
                                                                  645.60);
        
        FuncionarioComissionado funcCo = new FuncionarioComissionado(3030, 
                                                                "Seraphine Morgan", 
                                                                 "18/07/2021", 
                                                                  50.25);
        
        funcHora.setQtdeHoraTrab(90);
        funcHora.setCargo("Programadora");
        funcMen.setNumSalMin(2.5);
        funcMen.setCargo("Professor");
        funcCo.setCargo("Vendedora");
        funcCo.setSalBase(1200);
        funcCo.addVendas(3000);
        funcCo.addVendas(2000);
        funcCo.addVendas(5000);
        
        System.out.println("\nFuncionário Horista:");
        System.out.println("Registro: " + funcHora.getRegistro());
        System.out.println("Nome: " + funcHora.getNome());
        System.out.println("Data Admissão: " + funcHora.getDataAdmissao());
        System.out.println("Cargo: " + funcHora.getCargo());
        System.out.println("Salário bruto => " + df.format(funcHora.calcSalBruto()));
        System.out.println("Desconto => " + df.format(funcHora.calcDesconto()));
        System.out.println("Gratificação => " + df.format(funcHora.calcGratificacao()));
        System.out.println("Salário Líquido => " + df.format(funcHora.calcSalLiquido()) + "\n");
        
        System.out.println("\nFuncionário Mensalista:");
        System.out.println("Registro: " + funcMen.getRegistro());
        System.out.println("Nome: " + funcMen.getNome());
        System.out.println("Data Admissão: " + funcMen.getDataAdmissao());
        System.out.println("Cargo: " + funcMen.getCargo());
        System.out.println("Salário bruto => " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto => " + df.format(funcMen.calcDesconto()));
        System.out.println("Salário Líquido => " + df.format(funcMen.calcSalLiquido()) + "\n");
        
        System.out.println("\nFuncionário Comissionado:");
        System.out.println("Registro: " + funcCo.getRegistro());
        System.out.println("Nome: " + funcCo.getNome());
        System.out.println("Data Admissão: " + funcCo.getDataAdmissao());
        System.out.println("Cargo: " + funcCo.getCargo());
        System.out.println("Total Vendas => " + df.format(funcCo.getTotalVendas()));
        System.out.println("Taxa Comissão => " + df.format(funcCo.getTaxaComissao()) + "%");
        System.out.println("Salário bruto => " + df.format(funcCo.calcSalBruto()));
        System.out.println("Desconto => " + df.format(funcCo.calcDesconto()));
        System.out.println("Gratificação => " + df.format(funcCo.calcGratificacao()));
        System.out.println("Salário Líquido => " + df.format(funcCo.calcSalLiquido()) + "\n");
              
    }
}
