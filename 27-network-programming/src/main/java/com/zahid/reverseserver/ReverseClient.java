package com.zahid.reverseserver;

import java.net.Socket;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.util.Scanner;

public class ReverseClient {
    public static void main(String[] args) throws Exception {
        System.out.println("C> ");

        Socket soc = new Socket("127.0.0.1", 4096);

        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        Scanner sc = new Scanner(System.in);

        String incomingText = "";
        String outgoingText = "";

        while(!outgoingText.equalsIgnoreCase("end")) {
            System.out.print("# Enter a string> ");
            outgoingText = sc.nextLine();
            dos.writeUTF(outgoingText);
            dos.flush();

            incomingText = dis.readUTF();
            System.out.print("# Reversed: "+incomingText);
            System.out.println();
        }
        sc.close();
        dis.close();
        dos.close();
        soc.close();
    }
}