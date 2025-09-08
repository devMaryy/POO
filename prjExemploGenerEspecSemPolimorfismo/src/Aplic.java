/**
 *
 * @author Maria Simões
 */

import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

public class Aplic {

    public static void main(String[] args) {
        
        Aluno objAluno = new Aluno(2411, "Maria Eduarda", "28/03/2006"); //sem entrada de dados pelo usuário
        
        Professor objProf = new Professor(1022, "Dimas", "01/01/1970");
        
        objAluno.setMensalidade(1500);
        objProf.setSalario(20000);
        
        System.out.println("\nInformações do aluno:");
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data de Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + objAluno.getMensalidade());
        
        System.out.println("\n\nInformações do professor:");
        System.out.println("Registro Funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de Nascimento: " + objProf.getDataNascimento());
        System.out.println("Salário: " + objProf.getSalario());
        
    }
}
