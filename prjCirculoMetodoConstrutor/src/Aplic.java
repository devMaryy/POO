/**
 * @author Maria Simões
 */

import java.util.Scanner;

public class Aplic {

    
    public static void main(String[] args) {
        
        double medRaio;
        int opcao;
        String unidade; 
        
    //INSTANCIAÇÃO DO OBJETO DA CLASSE SCANNER, PARA RECEBER A ENTRADA DE DADOS:
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        System.out.println("Digite a medida do raio da circunferência: ");
        medRaio = entrada.nextDouble(); 
        
    //INSTANCIAÇÃO DE UM OBJETO DA CLASSE CIRCULO E CHAMADA DO MÉTODO CONSTRUTOR:
        Circulo objCir = new Circulo(unidade); 
        
        //PASSAGEM DE MENSAGEM:
        objCir.setRaio(medRaio);
        
        do{
            System.out.println("\n\n1 - Consultar medida da área");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar medida do diâmetro");
            System.out.println("4 - Encerrar");
            System.out.println("\n\nDigite a opcao: ");
            opcao = entrada.nextInt();
            
            System.out.println("\nMedida do raio da circunferência: " + 
                                objCir.getRaio() + " " + 
                                objCir.getUnidadeMedida());
            
            if(opcao == 1){
                System.out.println("\nMedida da área: " + objCir.calcArea() + 
                                    " " + objCir.getUnidadeMedida() + "²");
            } else
                if(opcao == 2) {
                    System.out.println("\nMedida do perímetro: " + 
                                        objCir.calcPerimetro() + " " + 
                                        objCir.getUnidadeMedida());
                } else
                    if(opcao == 3) {
                        System.out.println("\nMedida do diâmetro: " + 
                                            objCir.calcDiametro() + " " + 
                                            objCir.getUnidadeMedida());
                    } else
                        if(opcao == 4) {
                            System.out.println("\nEncerrado");
                        }
            
        }while(opcao < 4);
    
    }
    
}
