package Aula2;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 28.1;
        double conversao = (temperaturaCelsius * 1.8) + 32;



        System.out.println("""
                A converção de %.1fC em Fahrenheit
                é de %.1fF
                """.formatted(temperaturaCelsius, conversao)
        );

        int temperaturaFahrenheit = (int) conversao;

        System.out.println("valor inteiro em Fahrenheit é de: " + temperaturaFahrenheit);
    }
}
