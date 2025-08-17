import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    private static Set<PrintWriter> clientes = new HashSet<>();

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Servidor rodando na porta 12345...");

        while (true) {
            Socket cliente = servidor.accept();
            System.out.println("Novo cliente conectado: " + cliente.getInetAddress());

            new Thread(() -> {
                try {
                    BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                    PrintWriter saida = new PrintWriter(cliente.getOutputStream(), true);

                    synchronized (clientes) {
                        clientes.add(saida);
                    }

                    String mensagem;
                    while ((mensagem = entrada.readLine()) != null) {
                        System.out.println("Recebido: " + mensagem);
                        synchronized (clientes) {
                            for (PrintWriter c : clientes) {
                                c.println(mensagem);
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Cliente desconectado.");
                }
            }).start();
        }
    }
}
