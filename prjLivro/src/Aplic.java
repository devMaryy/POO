/**
 * @author Maria Simões
 */

import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int ident, opcao;
        double multa, valor;
        String titulo;

        System.out.println("\nDigite a identificacao do livro: ");
        ident = entrada.nextInt();
        System.out.println("\nDigite o título do livro: ");
        titulo = entrada.next();

        Livro obj1 = new Livro(ident, titulo);

        do {
            System.out.println("\n\n1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("\n\nDigite a opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n\nIdentificação: "
                                        + obj1.getIdentificacao());
                    System.out.println("Título: " + obj1.getTitulo());
                    if (obj1.getSituacao()) {
                        System.out.println("Situação: Emprestado");
                    } else {
                        System.out.println("Situação: Disponível");
                    }
                    break;

                case 2:
                    obj1.emprestar();

                    break;

                case 3:
                    if (!obj1.getSituacao()) {
                        System.out.println("\nO livro está disponível.");
                    } else {
                        System.out.print("\nDigite a quantidade de dias em atraso: ");
                        int dias = entrada.nextInt();

                        System.out.print("\nDigite o valor da multa diária: ");
                        multa = entrada.nextDouble();
                        obj1.setValMultaDiaria(multa);

                        valor = obj1.devolver(dias);
                        if (valor > 0) {
                            System.out.println("\nValor a pagar: R$ " + valor);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n\nEncerrado.");
                    break;
            }
        } while (opcao < 4);
    }
}
