package sockets.clientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
   /*     Socket inputServer = serverSocket.accept();
        Scanner inputMesg = new Scanner(inputServer.getInputStream());
        while (inputMesg.hasNext()) {
            System.out.println(inputMesg.nextLine());

        }
   */
        System.out.println("Server started!");
        Socket socket = serverSocket.accept();


        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())),true);

        String text = in.readLine();
        System.out.println("msg: " + text);
        out.println("Server accepted your message:" + text);


        in.close();
        out.close();
        System.out.println("Server closed!");
        socket.close();
        serverSocket.close();

    }
}
