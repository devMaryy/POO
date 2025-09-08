/**
 *
 * @author Maria Simões
 */

import fatec.poo.model.Aluno;

public class Aplic {

    public static void main(String[] args) {
        
        Aluno objAluno = new Aluno(2411, "Maria Eduarda", "28/03/2006"); //sem entrada de dados pelo usuário
        
        objAluno.setMensalidade(1500);
        
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data de Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + objAluno.getMensalidade());
    }
}
