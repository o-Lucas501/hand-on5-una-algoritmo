import java.util.ArrayList;

class Turma {

    private ArrayList<Double> notas;

    public Turma() {
        notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public void verificarSituacao() {

        double media = calcularMedia();

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Turma aprovada!");
        } else {
            System.out.println("Turma reprovada!");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Turma turma = new Turma();

        turma.adicionarNota(8.0);
        turma.adicionarNota(7.5);
        turma.adicionarNota(6.0);
        turma.adicionarNota(9.0);

        turma.verificarSituacao();
    }
}