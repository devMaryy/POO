/**
 * @author Maria Eduarda
 */

public class ContaCorrente {
    
    private int numero;
    private double saldo;
    
    public ContaCorrente (int num, double sal) {
        numero = num;
        saldo = sal;
    }
    
    public int getNumConta() {
        return(numero);
    }
    
    public double getSaldo() {
        return(saldo);
    }
    
    public void sacar(double valor) {
        if(valor > saldo)  {
            System.out.println("Saldo insuficiente!");
        }
        else {
              saldo = saldo - valor;     
        }
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
}
