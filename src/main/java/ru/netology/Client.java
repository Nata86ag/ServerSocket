package ru.netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        final String localhost = "127.0.0.1";
        int port = 8080;

        try (Socket clientSocket = new Socket(localhost, port);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("localhost");
            String r = in.readLine();
            System.out.println(r);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
