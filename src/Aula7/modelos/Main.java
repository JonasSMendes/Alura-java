package Aula7;


import Aula7.calculo.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {

        Series serie1 = new Series();

        serie1.setNome("One piece");
        serie1.setTemporadas(1);
        serie1.setEpisodiosPorTemporada(1090);
        serie1.setMinutosPorEpisodios(20);

        System.out.printf("o tempo em horas para terminar a serie %s %n é de aproximadamente %.0f horas%n", serie1.getNome(), serie1.getDuracaoEmHoras());
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(serie1);
        System.out.println("duraçao: " + calculadoraDeTempo.getTempoTotal());
    }
}
