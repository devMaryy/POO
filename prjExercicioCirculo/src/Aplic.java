/**
 * @author Maria Simões
 */

import java.util.Scanner;

public class Aplic {

    
    public static void main(String[] args) {
        
        double medRaio;
        int opcao;
        
    //INSTANCIAÇÃO DO OBJETO DA CLASSE SCANNER, PARA RECEBER A ENTRADA DE DADOS:
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a medida do raio da circunferência: ");
        medRaio = entrada.nextDouble(); //em C: scanf("%lf", &medRaio);
        
        
        //INSTANCIAÇÃO DE UM OBJETO DA CLASSE CIRCULO:
        Circulo objCir = new Circulo(); //new é igual o malloc
        
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
                                objCir.getRaio());
            
            if(opcao == 1){
                System.out.println("\nMedida da área: " + objCir.calcArea());
            } else
                if(opcao == 2) {
                    System.out.println("\nMedida do perímetro: " + 
                                        objCir.calcPerimetro());
                } else
                    if(opcao == 3) {
                        System.out.println("\nMedida do diâmetro: " + 
                                            objCir.calcDiametro());
                    } else
                        if(opcao == 4) {
                            System.out.println("\nEncerrado");
                        }
            
        }while(opcao < 4);
    
    }
    
}
