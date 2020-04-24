package test.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class ChatClient {

    private final static String HOST = "127.0.0.1";

    private final static int PORT = 12345;

    private final static int TIMEOUT = 15000;

    public static void main(String[] args) throws IOException, InterruptedException {

        for (int i = 0; i < 1000; i++) {
            try (Socket socket = new Socket(HOST, PORT)) {
                socket.setSoTimeout(TIMEOUT);
                try (PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)) {
                    pw.println("hello world");
                }
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
