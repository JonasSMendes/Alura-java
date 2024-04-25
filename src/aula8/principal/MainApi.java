package aula8.principal;

import aula8.modelos.Titulo2;
import aula8.modelos.TituloOmdb;
import aula8.modelos.exception.ErrorConersaoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String busca = "";

        List<Titulo2> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("qual filme voce quer?");
            busca = scanner.nextLine();


            if (busca.equalsIgnoreCase("sair")){
                break;
            }

            String URL = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=5774020";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(URL))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(tituloOmdb);

                Titulo2 meuTitulo = new Titulo2(tituloOmdb);
                System.out.println("titulo convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (ErrorConersaoException e) {
                System.out.println("aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("erro: " + e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

    }
}
