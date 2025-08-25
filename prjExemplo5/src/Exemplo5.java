/**
 * @author Maria Simões
 */

public class Exemplo5 {

    public static void main(String[] args) {
    
        int cont = 1;
        int x;
        
        x = (int)(Math.random()*100);
    
        System.out.println("\tTABUADA DO "+ x + "\n");
        
        do {
            System.out.println( x + " * " + cont + " = " + cont * x);
            cont++;
        } while (cont <= 10);
    }   
}
