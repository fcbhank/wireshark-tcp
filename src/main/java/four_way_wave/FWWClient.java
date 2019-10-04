package four_way_wave;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * Created by hank on 10/4/19
 */
public class FWWClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        String host = "127.0.0.1";
        int port = 8000;
        Socket socket = new Socket(host, port);
        socket.close();
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);

    }
}
