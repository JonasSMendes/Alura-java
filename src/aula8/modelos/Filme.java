package aula8.modelos;

import aula7.calculo.Classificavel;

public class Filme extends Titulo2 implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDelancamento, int duracaoEmHoras) {
        super(nome, anoDelancamento, duracaoEmHoras);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "filme: " + this.getNome() + " (" + this.getAnoDelancamento() + ")";
    }
}
