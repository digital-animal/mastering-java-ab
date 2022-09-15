package com.zahid.reverseserver;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class ReverseServer {
    public static void main(String[] args) throws Exception {
        System.out.println("S> ");

        ServerSocket ss = new ServerSocket(4096);
        Socket soc = ss.accept();
        
        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        DataInputStream dis = new DataInputStream(soc.getInputStream());

        String incomingText = "";
        String outgoingText = "";
        String str = "";

        while(!incomingText.equalsIgnoreCase("end")) {
            str = dis.readUTF();
            outgoingText = reveser(str);

            dos.writeUTF(outgoingText);
        }

        dis.close();
        dos.close();
        soc.close();
        ss.close();
    }    

    public static String reveser(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String text = sb.toString();
        return text;
    }
}
