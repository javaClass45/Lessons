package sockets.clientServer;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
   /*        System.out.println("socket.getInetAddress() = " + socket.getInetAddress());
        PrintWriter clientMesg = new PrintWriter(socket.getOutputStream());
        clientMesg.println("message from client!!!!!!!!! ALARMA!!!!!!");
        clientMesg.println("second message from client!!!!!!!!! ACHTUNG!!!!!!");*/

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        BufferedReader into = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));


        PrintWriter out = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())),true);

        System.out.println("Write message hear:");
        String msg = reader.readLine();

        out.println(msg); // отправляем сообщение
        String serverMsg = into.readLine();// получаем от сервера подтвеждение
        System.out.println("serverMsg = " + serverMsg);


        into.close();
        out.close();
        socket.close();
        System.out.println("Client closed!");
    }
}
