package aula4;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("qual sua avalicao para o filme: ");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.printf("media de avalicao: %.1f  %n", media/3);

    }
}
