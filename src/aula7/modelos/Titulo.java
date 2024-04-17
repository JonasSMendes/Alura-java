package Aula7;

public class Titulo {

    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaDeAvalicoes;
    private int totalDeAvalicoes;
    private int duracaoEmHoras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDelancamento() {
        return anoDelancamento;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDeAvalicoes() {
        return somaDeAvalicoes;
    }

    public int getTotalDeAvalicoes() {
        return totalDeAvalicoes;
    }

    public void setTotalDeAvalicoes(int totalDeAvalicoes) {
        this.totalDeAvalicoes = totalDeAvalicoes;
    }

    public double getDuracaoEmHoras() {
        return duracaoEmHoras;
    }


}
