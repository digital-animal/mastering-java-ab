package com.zahid.udpserver;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2001);

        String str = "Hello World";
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 2000);

        ds.send(dp);
        System.out.println("[Client] Sent: "+str);
        
        byte[] b = new byte[1024];
        dp = new DatagramPacket(b, 1024);
        ds.receive(dp);

        String msg = new String(dp.getData()).trim();
        System.out.println("[Client] Received: "+msg);

        ds.close();
    }
}