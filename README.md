### 借助 Wireshark 理解 TCP 的三次握手和四次挥手
详细内容：[博客](https://www.fcbhank.top/2019/09/30/%E7%A0%81%E5%86%9C%E7%AC%94%E8%AE%B0/%E5%80%9F%E5%8A%A9-Wireshark-%E7%90%86%E8%A7%A3-TCP-%E7%9A%84%E4%B8%89%E6%AC%A1%E6%8F%A1%E6%89%8B%E5%92%8C%E5%9B%9B%E6%AC%A1%E6%8C%A5%E6%89%8B/#more)

| 文件 | 说明 |
| --- | --- |
|[FWWClient.java](https://github.com/fcbhank/wireshark-tcp/blob/master/src/main/java/four_way_wave/FWWClient.java)| 四次挥手的客户端|
|[FWWServer](https://github.com/fcbhank/wireshark-tcp/blob/master/src/main/java/four_way_wave/FWWServer.java)| 四次挥手的服务端|
|[TWHClient.java](https://github.com/fcbhank/wireshark-tcp/blob/master/src/main/java/three_way_handshake/TWHClient.java)| 三次握手的客户端|
|[TWHServer.java](https://github.com/fcbhank/wireshark-tcp/blob/master/src/main/java/three_way_handshake/TWHServer.java)| 三次握手的服务端|
|[four_way_wave.pcapng](https://github.com/fcbhank/wireshark-tcp/blob/master/src/main/resources/capture/four_way_wave.pcapng)| Wireshark 捕获的四次挥手数据包|
|[three_way_shake.pcapng](https://github.com/fcbhank/wireshark-tcp/blob/master/src/main/resources/capture/three_way_shake.pcapng)| Wireshark 捕获的三次握手数据包| 
