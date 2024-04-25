package desafio3.start;

import desafio3.classifica.AvaliandoANota;
import desafio3.modelos.Musica;
import desafio3.modelos.Podcast;

public class main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();

        musica1.setCantor("Billie Holiday");
        musica1.setTitulo("solitude");
        musica1.setTotalDeReproducao(200000);
        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();
        }
        for (int i = 0; i < 800; i++) {
            musica1.curtir();
        }
        System.out.println("numero de curtidas: " + musica1.getCurtidas());
        System.out.println("numero de plays: " + musica1.getReproduzindo());

////////////////////////////////////////////////////////////////////////////////////////


        Podcast podcast1 = new Podcast();

        podcast1.setTitulo("BolhaDev");
        podcast1.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduzir();
        }

        for (int i = 0; i < 200; i++) {
            podcast1.curtir();
        }


        System.out.println("numero de curtidas: " + podcast1.getCurtidas());
        System.out.println("numero de plays: " + podcast1.getReproduzindo());
///////////////////////////////////////////////////////////////////////////////////////

        AvaliandoANota avaliandoANota = new AvaliandoANota();

        avaliandoANota.Avaliacao(podcast1);
        avaliandoANota.Avaliacao(musica1);

    }
}
