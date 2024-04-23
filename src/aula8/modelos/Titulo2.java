package aula8.modelos;

import aula8.modelos.exception.ErrorConersaoException;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaDasNotas;
    private int quantasNotasAdicionadas;
    private int duracaoEmHoras;

    public Titulo(String nome, int anoDelancamento) {
        this.nome = nome;
        this.anoDelancamento = anoDelancamento;
    }

    public Titulo(TituloOmdb tituloOmdb){
        this.nome = tituloOmdb.title();

        if (tituloOmdb.year().length() > 4){
            throw new ErrorConersaoException("não consegui converter o ano" +
                    "porque tem mais de 4 caracter");
        }
        this.anoDelancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmHoras = Integer.valueOf(tituloOmdb.runtime());

    }


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

    public double getSomaDasNotas() {
        return somaDasNotas;
    }

    public void setSomaDasNotas(double somaDasNotas) {
        this.somaDasNotas = somaDasNotas;
    }

    public int getQuantasNotas() {
        return quantasNotasAdicionadas;
    }

    public void setQuantasNotas(int quantasNotas) {
        this.quantasNotasAdicionadas = quantasNotas;
    }

    public double getDuracaoEmHoras() {
        return duracaoEmHoras;
    }

    public void avalia(int nota){
        somaDasNotas += nota;
        quantasNotasAdicionadas++;
    }

    public int pegaMedia(){
        return (int) somaDasNotas / quantasNotasAdicionadas;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
