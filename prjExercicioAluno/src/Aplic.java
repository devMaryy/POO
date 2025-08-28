/**
 * @author Maria Eduarda
 */

import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        
        int numRA, opcao;
        double notaP1, notaP2, notaT1, notaT2;
                
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o RA do aluno: ");
        numRA = entrada.nextInt(); 
        System.out.println("\nDigite a nota da PROVA 1: ");
        notaP1 = entrada.nextDouble();
        System.out.println("\nDigite a nota da PROVA 2: ");
        notaP2 = entrada.nextDouble();
        System.out.println("\nDigite a nota do TRABALHO 1: ");
        notaT1 = entrada.nextDouble();
        System.out.println("\nDigite a nota do TRABALHO 2: ");
        notaT2 = entrada.nextDouble();
        
        Aluno objAluno = new Aluno(); 
        
        objAluno.setRA(numRA);
        objAluno.setNtPrv1(notaP1);
        objAluno.setNtPrv2(notaP2);
        objAluno.setNtTrab1(notaT1);
        objAluno.setNtTrab2(notaT2);
        
        do{
            System.out.println("\n\n1 - Exibir nota das provas/trabalhos");
            System.out.println("2 - Exibir média dos trabalhos/provas");
            System.out.println("3 - Exibir média final");
            System.out.println("4 - Sair");
            System.out.println("\n\nDigite a opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("\n\nRA do aluno: " + objAluno.getRA());
            
            if(opcao == 1){
                System.out.println("\nNotas das provas:\n" + "Prova 1: " + 
                                    objAluno.getNtPrv1() + "\nProva 2: " 
                                    + objAluno.getNtPrv2());
                System.out.println("\nNotas dos trabalhos:\n" + "Trabalho 1: "
                                    + objAluno.getNtTrab1() + "\nTrabalho 2: "
                                    + objAluno.getNtTrab2());
            } else
                if(opcao == 2) {
                    System.out.println("\nMédia dos trabalhos: " + 
                                        objAluno.calcMediaTrab() + 
                                        "\nMédia das provas: " + 
                                        objAluno.calcMediaProva());
                } else
                    if(opcao == 3) {
                        System.out.println("\nMédia final: " + 
                                            objAluno.calcMediaFinal());
                    } else
                        if(opcao == 4) {
                            System.out.println("\nEncerrado");
                        }
            
        }while(opcao < 4);
    }
    
}
