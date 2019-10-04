package three_way_handshake;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * Created by hank on 10/1/19
 */
public class TWHServer {
    public static void main(String[] args) throws Exception {
        // 监听指定端口
        int port = 8000;
        ServerSocket serverSocket = new ServerSocket(port);

        // TWHServer 等待 TWHClient 的连接
        System.out.println("TWHServer 等待 TWHClient 的连接…………");
        Socket socket = serverSocket.accept();

        // 连接建立好后，从 socket 获取输入流，并建立缓冲区读取
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        StringBuilder stringBuilder = new StringBuilder();
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            stringBuilder.append(new String(bytes, 0, len, StandardCharsets.UTF_8));
        }
        System.out.println("TWHClient 发送的消息为：" + stringBuilder);

        // 关闭流
        inputStream.close();
        socket.close();
        serverSocket.close();


    }
}
