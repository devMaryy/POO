/**
 * @author Maria Eduarda
 */

public class Aluno {
    
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public void setRA(int r) {
        RA = r;
    }
    
    public int getRA() {
        return(RA);
    }
    
    public void setNtPrv1(double a) {
        NtPrv1 = a;
    }
    
    public double getNtPrv1() {
        return(NtPrv1);
    }
    
    public void setNtPrv2(double b) {
        NtPrv2 = b;
    }
    
    public double getNtPrv2() {
        return(NtPrv2);
    }
    
    public void setNtTrab1(double c) {
        NtTrab1 = c;
    }
    
    public double getNtTrab1() {
        return(NtTrab1);
    }
    
     public void setNtTrab2(double d) {
        NtTrab2 = d;
    }
    
    public double getNtTrab2() {
        return(NtTrab2);
    }
    
    public double calcMediaProva() {
        return(0.75 * (NtPrv1 + 2 * NtPrv2) / 3);
    }
    
    public double calcMediaTrab() {
        return(0.25 * (NtTrab1 + NtTrab2) / 2);
    }
    
    public double calcMediaFinal() {
        return(calcMediaProva() + calcMediaTrab());
    }
}
