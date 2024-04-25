package aula4;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double media = 0;
        double nota=0;
        int contador = 0;

        while (nota != -1) {
            System.out.println("qual sua avalicao para o filme ou -1 para encerrar e pegar a media ");
            nota = leitura.nextDouble();
            if (nota != -1){
                media += nota;
                contador++;
            }
        }

        System.out.printf("media de avalicao: %.1f  %n", media/contador);

    }
}
