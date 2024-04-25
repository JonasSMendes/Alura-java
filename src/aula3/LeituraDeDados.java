package aula3;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("coloque sua nota do filme");
        double nota = leitura.nextDouble();
        System.out.println("seu filme favorito é: " + filme);
        System.out.println("sua nota é: " + nota);
    }
}
