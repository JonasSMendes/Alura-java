package aula7.modelos;

public class Series extends Titulo {

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodios;

    public Series(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public double getDuracaoEmHoras() {
        return (double) temporadas * episodiosPorTemporada * minutosPorEpisodios / 60 ;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDelancamento() + ")";
    }
}
