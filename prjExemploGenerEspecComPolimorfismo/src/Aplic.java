/**
 * @author Maria Simões
 */

import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

public class Aplic {
     
    public static void main(String[] args) {
        
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
                                                                  0.50);
        
        funcHora.setQtdeHoraTrab(90);
        funcMen.setNumSalMin(2.5);
        funcHora.setCargo("Programadora");
        funcMen.setCargo("Professor");
        funcCo.setSalBase(1200);
        funcCo.addVendas(8000);
        
        System.out.println("\nFuncionário Horista:");
        System.out.println("Registro: " + funcHora.getRegistro());
        System.out.println("Nome: " + funcHora.getNome());
        System.out.println("Data Admissão: " + funcHora.getDataAdmissao());
        System.out.println("Cargo: " + funcHora.getCargo());
        System.out.println("Salário bruto => " + funcHora.calcSalBruto());
        System.out.println("Desconto => " + funcHora.calcDesconto());
        System.out.println("Gratificação => " + funcHora.calcGratificacao());
        System.out.println("Salário Líquido => " + funcHora.calcSalLiquido() + "\n");
        
        System.out.println("\nFuncionário Mensalista:");
        System.out.println("Registro: " + funcMen.getRegistro());
        System.out.println("Nome: " + funcMen.getNome());
        System.out.println("Data Admissão: " + funcMen.getDataAdmissao());
        System.out.println("Cargo: " + funcMen.getCargo());
        System.out.println("Salário bruto => " + funcMen.calcSalBruto());
        System.out.println("Desconto => " + funcMen.calcDesconto());
        System.out.println("Salário Líquido => " + funcMen.calcSalLiquido() + "\n");
        
        
        System.out.println("\nFuncionário Comissionado:");
        System.out.println("Registro: " + funcCo.getRegistro());
        System.out.println("Nome: " + funcCo.getNome());
        System.out.println("Data Admissão: " + funcCo.getDataAdmissao());
        System.out.println("Total Vendas: " + funcCo.getTotalVendas());
        System.out.println("Taxa Comissão: " + funcCo.getTaxaComissao());
        System.out.println("Salário bruto => " + funcCo.calcSalBruto());
        System.out.println("Desconto => " + funcCo.calcDesconto());
        System.out.println("Gratificação => " + funcCo.calcGratificacao());
        System.out.println("Salário Líquido => " + funcCo.calcSalLiquido() + "\n");
              
    }
}
