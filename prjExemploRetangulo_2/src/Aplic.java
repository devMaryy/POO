/**
 * @author Maria Simões
 */

import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        
        double medAlt, medBase;
        int opcao;
        
    //INSTANCIAÇÃO DO OBJETO DA CLASSE SCANNER, PARA RECEBER A ENTRADA DE DADOS:
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble(); //em C: scanf("%lf", &medAlt);
        
        System.out.println("Digite a medida da base do retãngulo: ");
        medBase = entrada.nextDouble();
        
        //INSTANCIAÇÃO DE UM OBJETO DA CLASSE RETANGULO:
        Retangulo objRet = new Retangulo(); //new é igual o malloc
        
        //PASSAGEM DE MENSAGENS:
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n\n1 - Consultar medida da área");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar medida da diagonal");
            System.out.println("4 - Encerrar");
            System.out.println("\n\nDigite a opcao: ");
            opcao = entrada.nextInt();
            
            System.out.println("Medida da altura do retângulo: " + 
                                objRet.getAltura());
            System.out.println("Medida da base do retângulo: " + 
                                objRet.getBase());
            
            if(opcao == 1){
                System.out.println("\nMedida da área: " + objRet.calcArea());
            } else
                if(opcao == 2) {
                    System.out.println("\nMedida do perímetro: " + 
                                        objRet.calcPerimetro());
                } else
                    if(opcao == 3) {
                        System.out.println("\nMedida da diagonal: " + 
                                            objRet.calcDiagonal());
                    } else
                        if(opcao == 4) {
                            System.out.println("\nEncerrado");
                        }
            
        }while(opcao < 4);
    }
    
}
