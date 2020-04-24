package test.socket;


import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {


    private final Socket socket;

    private final String clientIdentify;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        this.clientIdentify = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
    }

    @Override
    public void run() {
        try {
            this.chat();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            this.release();
        }
    }

    private void release() {
        try {
            if (this.socket != null) {
                this.socket.close();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private void chat() throws IOException {
        BufferedReader bufferedReader = wrap2Reader(socket.getInputStream());
        PrintStream printStream = wrap2Write(socket.getOutputStream());
        String received;
        while ((received = bufferedReader.readLine()) != null) {
            System.out.printf("client:%s-message:%s\n", clientIdentify, received);
            if (received.equals("exit")) {
                write2Client(printStream, received);
                socket.close();
                break;
            }
            write2Client(printStream, "Server:" + received);
        }
    }

    private BufferedReader wrap2Reader(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private PrintStream wrap2Write(OutputStream outputStream) {
        return new PrintStream(outputStream);
    }

    private void write2Client(PrintStream print, String message) {
        print.println(message);
        print.flush();
    }
}
