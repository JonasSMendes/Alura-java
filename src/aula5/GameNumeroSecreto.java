package aula5;

import java.util.Random;
import java.util.Scanner;

public class GameNumeroSecreto {
    public static void main(String[] args) {
        Scanner aposta = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(100);
        int numeroUsuario = 0;
        int contador = 0;

        System.out.println("jogo do numero secreto em 5 tentativas");

        while (numeroUsuario != numeroSecreto){
            System.out.println("digite o numero secreto");
            numeroUsuario = aposta.nextInt();
            if (numeroUsuario == numeroSecreto){
                System.out.println("Você acertou parabens");
                break;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("o numero secreto é maior");
            }else {
                System.out.println("o numero secreto é menor");
            }

            contador++;
            if (contador == 5){
                break;
            }
        }

        System.out.println("numero secreto: " + numeroSecreto);
        System.out.println("você não conseguiu em: " + contador + "tentativas");
    }
}
