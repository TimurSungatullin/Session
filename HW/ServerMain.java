package server15;

import java.io.*;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args) throws IOException {
        boolean check = false;
        String host = "localhost";
        Socket socket = new Socket(host, 8080);
        String request = "GET /main HTTP/1.0\r\n\r\n";
        try (OutputStream os = socket.getOutputStream();
             BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            os.write(request.getBytes());
            os.flush();
            String s;
            while((s = bf.readLine())!= null) {
                System.out.println(s);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}