package four_way_wave;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by hank on 10/4/19
 */
public class FWWServer {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        System.out.println("服务器运行中……");
        socket.close();
        serverSocket.close();
        System.out.println("服务器关闭连接");

    }
}
