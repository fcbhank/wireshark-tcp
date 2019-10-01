package three_way_handshake;

import java.net.ServerSocket;
import java.util.concurrent.TimeUnit;

/**
 * Created by hank on 10/1/19
 */
public class TWHServer {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(8000);
        socket.accept();
        // 为了方便 wireshark 抓包
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }
}
