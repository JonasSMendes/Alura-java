package Aula2;

public class MediaNotas {
    public static void main(String[] args) {
        double nota1 = 6.30;
        double nota2 = 7.45;

        double media = (nota1 + nota2) / 2;

        System.out.println(""" 
                a media de %.2f + %.2f é de: %.2f
                """.formatted(nota1,nota2,media));
    }
}
