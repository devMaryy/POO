/**
 * @author Maria Eduarda
 */

import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double valSal, valDep, valSaque;
        int num, opcao;
        
        System.out.print("Digite o número da conta: ");
        num = entrada.nextInt();
        System.out.print("Digite o valor do saldo inicial: ");
        valSal = entrada.nextDouble();
              
        ContaCorrente obj1 = new ContaCorrente(num, valSal);        
        
        do{
            System.out.println("\n\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opção: ");
            opcao = entrada.nextInt(); 
            
            System.out.println("\n\nNúmero da conta: " + obj1.getNumConta());
            
            if (opcao == 1){
                System.out.println("\nDigite o valor que deseja depositar: ");
                valDep = entrada.nextDouble();
                obj1.depositar(valDep);
                System.out.println("\nSaldo atual: " + obj1.getSaldo());
            }else
               if (opcao == 2){
                   System.out.println("\nDigite o valor que deseja sacar: ");
                   valSaque = entrada.nextDouble();
                   obj1.sacar(valSaque);
                   System.out.println("\nSaldo atual: " + obj1.getSaldo()); 
               }else
                  if (opcao == 3){
                    System.out.println("\nSaldo atual: " + obj1.getSaldo()); 
                  } 
        }while(opcao < 4);
    }
}
