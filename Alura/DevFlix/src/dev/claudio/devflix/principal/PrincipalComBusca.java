package dev.claudio.devflix.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual filme você deseja pesquisar? ");
        String filmenome = sc.nextLine();

        String url = "http://www.omdbapi.com/?t=" + filmenome +"&apikey" +
                "=c28a98c";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());


    }
}
