/**
 * @author Maria Simões
 */

public class Aplic {
    
    public static void main(String[] args) {
        // DEFINIÇÃO DO PONTEIRO:
        Retangulo objRet;
        
        //INSTANCIAÇÃO (ALOCAÇÃO) DO OBJETO DA CLASSE RETANGULO:
        objRet = new Retangulo();
        
        //IMPLEMENTAÇÃO DO CASO DE USO MONTAR FIGURA GEOMETRICA RETANGULO:
        objRet.setAltura(5.0);  //passagem de mensagem
        objRet.setBase(8.0);    //passagem de mensagem
        
        System.out.println("Medida da altura do retêngulo: " + 
                            objRet.getAltura());
        
        System.out.println("Medida da base do retêngulo: " + objRet.getBase());
        
        //IMPLEMENTAÇÃO DO CASO DE USO CONSULTAR ÁREA DA FIGURA GEOMETRICA RETANGULO:
        System.out.println("Medida da área do retângulo: " + objRet.calcArea());
        
        //IMPLEMENTAÇÃO DO CASO DE USO CONSULTAR PERÍMETRO DA FIGURA GEOMETRICA RETANGULO:
        System.out.println("Medida do perímetro do retângulo: " + 
                            objRet.calcPerimetro());
        
        //IMPLEMENTAÇÃO DO CASO DE USO CONSULTAR DIAGONAL DA FIGURA GEOMETRICA RETANGULO:
        System.out.println("Medida da diagonal do retângulo: " + 
                            objRet.calcDiagonal());
        
        
        //CRIAÇÃO DO SEGUNDO OBJETO RETANGULO:
        Retangulo objRet1 = new Retangulo(); //Simplificando: definição do ponteiro com a alocação do objeto
        
        objRet1.setAltura(3.0);
        objRet1.setBase(4.0);
        
        System.out.println("Medida da altura do retêngulo: " + 
                            objRet1.getAltura());
        System.out.println("Medida da base do retêngulo: " + objRet1.getBase());
        System.out.println("Medida da área do retângulo: " + objRet1.calcArea());
        System.out.println("Medida do perímetro do retângulo: " + 
                            objRet1.calcPerimetro());
        System.out.println("Medida da diagonal do retângulo: " + 
                            objRet1.calcDiagonal());
    }
}
