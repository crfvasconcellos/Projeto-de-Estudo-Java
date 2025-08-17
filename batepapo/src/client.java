import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Digite o IP do servidor: ");
        String ip = teclado.readLine();

        Socket socket = new Socket(ip, 12345);
        System.out.println("Conectado ao servidor.");

        // Thread para receber mensagens
        new Thread(() -> {
            try {
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String mensagem;
                while ((mensagem = entrada.readLine()) != null) {
                    System.out.println(mensagem);
                }
            } catch (IOException e) {
                System.out.println("Conexão encerrada.");
            }
        }).start();

        // Enviar mensagens
        PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
        String texto;
        while ((texto = teclado.readLine()) != null) {
            saida.println(texto);
        }
    }
}
