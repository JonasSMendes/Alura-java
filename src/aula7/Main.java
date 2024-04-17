package aula7.modelos;


import aula7.calculo.CalculadoraDeTempo;
import aula7.calculo.FiltroRecomendacao;

public class Main {
    public static void main(String[] args) {

        Series onePiece = new Series();

        onePiece.setNome("One piece");
        onePiece.setTemporadas(1);
        onePiece.setEpisodiosPorTemporada(1090);
        onePiece.setMinutosPorEpisodios(20);

        System.out.printf("o tempo em horas para terminar a serie %s %n é de aproximadamente %.0f horas%n", onePiece.getNome(), onePiece.getDuracaoEmHoras());
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(onePiece);
        System.out.println("duraçao: " + calculadoraDeTempo.getTempoTotal());

//////////////////////////////////////////////////////////////////////////
        Filme filme1 = new Filme();

        filme1.setNome("Coraline");
        filme1.avalia(9);
        filme1.avalia(1);
        filme1.avalia(9);

        System.out.println("media do filme: " + filme1.pegaMedia());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
//////////////////////////////////////////////////////////////////////////////////
        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSeries(onePiece);
        episodios.setTotalViws(2000);
        episodios.setNome("Luffy morre");
        filtro.filtra(episodios);

    }
}
