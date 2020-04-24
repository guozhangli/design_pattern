package test.socket;

import java.io.IOException;

public class TestChatServer {

    public static void main(String[] args) throws IOException {
        new ChatServer().startServer();
    }
}
