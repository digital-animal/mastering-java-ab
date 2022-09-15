package com.zahid.udpserver;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2000);
        
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, 1024);
        ds.receive(dp);

        String msg = new String(dp.getData()).trim();
        System.out.println("[Server] Received: "+msg);
        String str = reverse(msg);
        
        dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 2001);
        ds.send(dp);
        System.out.println("[Server] Sent: "+str);

        ds.close();
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String text = sb.toString();
        return text;
    }
}
