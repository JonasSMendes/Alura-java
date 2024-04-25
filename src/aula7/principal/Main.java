package aula7.principal;


import aula7.calculo.CalculadoraDeTempo;
import aula7.calculo.FiltroRecomendacao;
import aula7.modelos.Episodios;
import aula7.modelos.Filme;
import aula7.modelos.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Series onePiece = new Series("One Piece", 1995);
        onePiece.setTemporadas(1);
        onePiece.setEpisodiosPorTemporada(1090);
        onePiece.setMinutosPorEpisodios(20);

        System.out.printf("o tempo em horas para terminar a serie %s %n é de aproximadamente %.0f horas%n", onePiece.getNome(), onePiece.getDuracaoEmHoras());
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(onePiece);
        System.out.println("duraçao: " + calculadoraDeTempo.getTempoTotal());

//////////////////////////////////////////////////////////////////////////
        var filme1 = new Filme("coraline",2005);
        filme1.avalia(9);

        var filmeJonas = new Filme("Kill Bill VL1", 2012);
        filmeJonas.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeJonas);
        listaDeFilmes.add(filme1);

        System.out.println("primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);



///////////////////////////////////////////////////////////////////////////////
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
