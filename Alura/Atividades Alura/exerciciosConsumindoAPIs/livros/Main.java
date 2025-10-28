package exerciciosConsumindoAPIs.livros;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        String livro = sc.nextLine();


        String url = "https://www.googleapis.com/books/v1/volumes?q=" + livro +
                "&key=AIzaSyAUVizqwPga-gglb0EgitCFwt_7Q3Y5Hmg" ; //chave =AIzaSyAUVizqwPga-gglb0EgitCFwt_7Q3Y5Hmg

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());


    }
}
