package aula8.desafios;

import com.sun.net.httpserver.Request;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CriptoMoedasApi {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("qual cripto moeda você quer saber o valor?");
        String valorDaCripto = scanner.nextLine();

        var URL = "https://api.coingecko.com/api/v3/simple/price?ids="+ valorDaCripto +"&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request =  HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .GET()
                .header("accept", "application/json")
                .header("x-cg-demo-api-key", "CG-34PYjegZTakzTn2J3PMCauVW")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
