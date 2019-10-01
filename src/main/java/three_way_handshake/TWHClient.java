package three_way_handshake;

import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * Created by hank on 10/1/19
 */
public class TWHClient {
    public static void main(String[] args) throws Exception {
        // 连接服务器的 8000 端口
        Socket socket = new Socket("127.0.0.1", 8000);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello".getBytes());
        outputStream.write("Hi".getBytes());
        outputStream.write("World".getBytes());
        // 为了方便 wireshark 抓包
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }
}
