package com.zahid.primeserver;

import java.net.Socket;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.util.Scanner;

public class PrimeClient {

    public static void main(String[] args) throws Exception {
        System.out.println("# PrimeClient ");

        Socket soc = new Socket("127.0.0.1", 4096);

        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        Scanner sc = new Scanner(System.in);

        boolean incomingResult;
        int outgoingNum;

        while(true) {

            System.out.print("# Enter an integer(-1 to exit)> ");
            outgoingNum = sc.nextInt();
            if(outgoingNum == -1) break;

            dos.writeInt(outgoingNum);
            dos.flush();

            incomingResult = dis.readBoolean();
            System.out.print("# isPrime: "+incomingResult);
            System.out.println();
        }
        sc.close();
        dis.close();
        dos.close();
        soc.close();
    }
}