package aula7.modelos;

import aula7.calculo.Classificavel;

public class Episodios implements Classificavel {

    private int numero;
    private String nome;
    private Series series;
    private int totalViws;

    public int getTotalViws() {
        return totalViws;
    }

    public void setTotalViws(int totalViws) {
        this.totalViws = totalViws;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassificacao() {
        if (totalViws > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
