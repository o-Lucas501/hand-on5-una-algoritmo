import java.util.HashSet;

class Presenca {

    private HashSet<String> alunos;

    public Presenca() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome) {
        alunos.add(nome);
    }

    public void mostrarPresenca() {

        System.out.println("Alunos presentes:");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Quantidade: " + alunos.size());
    }
}

public class Main {

    public static void main(String[] args) {

        Presenca presenca = new Presenca();

        presenca.adicionarAluno("Lucas");
        presenca.adicionarAluno("Maria");
        presenca.adicionarAluno("João");
        presenca.adicionarAluno("Lucas");
        presenca.adicionarAluno("Maria");

        presenca.mostrarPresenca();
    }
}