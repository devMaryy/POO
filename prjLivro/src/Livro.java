/**
 * @author Maria Simões
 */

public class Livro {

    private int identificacao;
    private double valMultaDiaria;
    private String titulo;
    private boolean situacao; // false = Disponível, true = Emprestado

    public Livro(int id, String ti) {
        identificacao = id;
        titulo = ti;
        situacao = false;
    }

    public void setValMultaDiaria(double a) {
        valMultaDiaria = a;
    }

    public int getIdentificacao() {
        return (identificacao);
    }

    public String getTitulo() {
        return (titulo);
    }

    public boolean getSituacao() {
        return (situacao);
    }

    public void emprestar() {
        if (situacao) {
            System.out.println("\nO livro está emprestado.");
        } else {
            System.out.println("\nOperação de empréstimo realizada com sucesso!");
            situacao = true;
        }

    }

    public double devolver(int diasAtraso) {
        if (!situacao) {
            System.out.println("\nO livro está disponível.");
            return 0.0;
        } else {
            situacao = false;
            System.out.println("\nOperação de devolução realizada com sucesso!");
            if (diasAtraso > 0) {
                return (diasAtraso * valMultaDiaria);
            } else {
                return 0.0;
            }
        }
    }
}
