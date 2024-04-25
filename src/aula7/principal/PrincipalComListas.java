package aula7.principal;

import aula7.modelos.Filme;
import aula7.modelos.Series;
import aula7.modelos.Titulo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        var coraline = new Filme("Coraline",2005);
        coraline.avalia(9);
        var killBill = new Filme("Kill Bill VL1", 2012);
        killBill.avalia(8);
        var onePiece = new Series("One Piece", 1995);
        onePiece.avalia(10);

        List<Titulo> lista = new ArrayList<>();


        lista.add(killBill);
        lista.add(coraline);
        lista.add(onePiece);

        for (Titulo i : lista) {
            System.out.println(i);
            if (i instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("classificação: " + filme.getClassificacao());
            }
        }

        System.out.println("lista de titulos");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDelancamento));
        System.out.println("ordenando por ano");
        System.out.println(lista);

        ArrayList<String> buscaPorartista = new ArrayList<>();

        buscaPorartista.add("Adam Sandler");
        buscaPorartista.add("Di-Caprio");
        buscaPorartista.add("vitor mello");
        buscaPorartista.add("Sandra chin");
        System.out.println(buscaPorartista);

        Collections.sort(buscaPorartista);
        System.out.println("depois da ordenaçao ");
        System.out.println(buscaPorartista);


    }
}
