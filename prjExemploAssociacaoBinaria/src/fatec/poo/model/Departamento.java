/**
 * @author Maria Simões
 */

package fatec.poo.model;

public class Departamento {
    
    private String sigla, nome;
    private int numFunc; // Indicador
    private Funcionario[] funcionarios; // Multiplicidade 1..* -- Ponteiro Matriz

    public Departamento(String sigla, String nome) {
        this.sigla = sigla; // THIS diferencia atributo de parâmetro, verde é atributo e preto é parâmetro.
        this.nome = nome;
        funcionarios = new Funcionario[5]; // Matriz de ponteiros
        numFunc = 0; // Redundante, indica a posição do 1º elemento da matriz
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    // Tem como parâmetro de entrada um endereço de um objeto das subclasses FuncionarioHorista, FuncionarioMensalista ou FuncionarioComissionado:
    public void addFuncionario (Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
        // funcionarios[numFunc++] = f; --> Junta as duas instruções
    }
    
    public void listarFuncionarios() {
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome do Departamento: " + nome);
        System.out.println("Qtde. funcionários: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        
        for (int x = 0; x < numFunc; x++) {
            System.out.print(funcionarios[x].getRegistro() + "\t\t");
            System.out.print(funcionarios[x].getNome() + "\t\t");
            System.out.println(funcionarios[x].getCargo() + "\t\t");
        }
    }
}
