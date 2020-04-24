package test.socket;

import ThreadPool.ThreadPool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ThreadPool.BasicThreadPool;


public class ChatServer {

    private final int port;

    private ExecutorService executorService;

    private ServerSocket serverSocket;

    public ChatServer(int port) {
        this.port = port;
    }

    public ChatServer() {
        this(12345);
    }

    public void startServer() throws IOException {
        this.executorService = Executors.newFixedThreadPool(4);
        this.serverSocket = new ServerSocket(port);
        this.serverSocket.setReuseAddress(true);
        System.out.println("chat server is started and listen at port:" + port);
        this.listen();
        this.executorService.shutdown();
    }

    private void listen() throws IOException {
        for (; ; ) {
            Socket client = serverSocket.accept();
            this.executorService.execute(new ClientHandler(client));
        }
    }
}
