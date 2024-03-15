package br.com.caelum.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        System.out.println("A porta 12345 está liberada");
        Socket client = server.accept();
        System.out.println("Nova conexao com o cliente" + client.getInetAddress().getHostAddress());

        Scanner scanner = new Scanner(client.getInputStream());

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
        client.close();
        server.close();

    }
}
