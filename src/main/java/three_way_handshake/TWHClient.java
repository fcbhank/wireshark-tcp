package three_way_handshake;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * Created by hank on 10/1/19
 */
public class TWHClient {
    public static void main(String[] args) throws Exception {
        // 指定服务器的 IP 地址和 端口号
        String host = "127.0.0.1";
        int port = 8000;

        // 与服务端建立连接
        Socket socket = new Socket(host, port);

        // 获取输出流
        OutputStream outputStream = socket.getOutputStream();
        String message = "Hello";
        outputStream.write(message.getBytes(StandardCharsets.UTF_8));

        outputStream.close();
        socket.close();

    }
}
