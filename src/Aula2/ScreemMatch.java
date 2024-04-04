package Aula2;

public class ScreemMatch {
    public static void main(String[] args) {

        int anoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String sinopse = "Filme de ação com avioês";

        System.out.println("""
                Esse é o Screem Match!!
                          
                Filme: Top Gun: Maverick
                sinopse do filme: %s
                nota do filme: %.1f
                ano de lançamento: %d
                incluido no seu plano: %s
                """.formatted(sinopse, notaDoFilme,anoLancamento,incluidoNoPlano)
        );

        int classificacao = (int) (notaDoFilme / 2);
        System.out.println(classificacao);

    }
}
