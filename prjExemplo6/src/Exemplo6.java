/**
 * @author Maria Simões
 */

public class Exemplo6 {

    public static void main(String[] args) {
    
        int TabNum[];
        int cont;
        
        TabNum = new int[3];
        
        TabNum[0] = 34;
        TabNum[1] = 18;
        TabNum[2] = 27;
        
        for(cont = 0; cont < 3; cont++) {
            System.out.print("Conteúdo de TabNum[" + cont + "] = ");
            System.out.println(TabNum[cont]);
        }   
    }
}
