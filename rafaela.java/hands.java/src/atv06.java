import java.util.ArrayList;
import java.util.Scanner;

class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(int codigo, String titulo, String autor) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {

        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("Livro indisponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido!");
    }
}

class Biblioteca {

    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {

        System.out.println("Lista de livros:");

        for (Livro l : livros) {

            System.out.println(
                l.getCodigo() + " - " +
                l.getTitulo() + " - " +
                l.getAutor() + " - " +
                (l.isDisponivel() ? "Disponível" : "Indisponível")
            );
        }
    }

    public void emprestarLivro(int codigo) {

        for (Livro l : livros) {

            if (l.getCodigo() == codigo) {
                l.emprestar();
            }
        }
    }

    public void devolverLivro(int codigo) {

        for (Livro l : livros) {

            if (l.getCodigo() == codigo) {
                l.devolver();
            }
        }
    }
}

public class atv06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcao;

        do {

            System.out.println("\n1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    biblioteca.cadastrarLivro(
                        new Livro(codigo, titulo, autor)
                    );

                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:

                    System.out.print("Código do livro: ");
                    int codEmprestimo = sc.nextInt();

                    biblioteca.emprestarLivro(codEmprestimo);

                    break;

                case 4:

                    System.out.print("Código do livro: ");
                    int codDevolucao = sc.nextInt();

                    biblioteca.devolverLivro(codDevolucao);

                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}