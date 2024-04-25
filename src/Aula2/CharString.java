package Aula2;

public class CharString {
    public static void main(String[] args) {
        char letra = 'o';
        String palavra = "carro";

        System.out.println("""
                %c %s é azul
                """.formatted(letra,palavra));

    }
}
