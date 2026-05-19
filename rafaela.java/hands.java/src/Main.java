import java.util.ArrayList;

class Produto {

    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class ListaCompras {

    private ArrayList<Produto> produtos;

    public ListaCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {

        System.out.println("Produtos cadastrados:");

        for (Produto p : produtos) {
            System.out.println(p.getNome());
        }

        System.out.println("Quantidade total: " + produtos.size());
    }
}

public class Main {

    public static void main(String[] args) {

        ListaCompras lista = new ListaCompras();

        lista.adicionarProduto(new Produto("Arroz"));
        lista.adicionarProduto(new Produto("Feijão"));
        lista.adicionarProduto(new Produto("Leite"));
        lista.adicionarProduto(new Produto("Pão"));
        lista.adicionarProduto(new Produto("Café"));

        lista.listarProdutos();
    }
}