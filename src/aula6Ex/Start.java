package aula6Ex;

public class Start {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.name = "Coraline";
        meuFilme.year = 2005;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(6);
        meuFilme.avalia(4);
        meuFilme.avalia(7);
        System.out.println("total de avalição: " + meuFilme.getSomaValidation());
        System.out.println("todas as avaliçoes: " + meuFilme.getAllValidation());
        System.out.println("media total: " + meuFilme.mediaValidatio());
    }
}
