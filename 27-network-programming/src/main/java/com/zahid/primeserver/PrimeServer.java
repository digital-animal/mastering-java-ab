package com.zahid.primeserver;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class PrimeServer {

    public static void main(String[] args) throws Exception {
        System.out.println("# PrimeServer ");

        ServerSocket ss = new ServerSocket(4096);
        Socket soc = ss.accept();
        
        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        DataInputStream dis = new DataInputStream(soc.getInputStream());

        int incomingNum;
        boolean outgoingResult;

        while(true) {

            incomingNum = dis.readInt();
            if(incomingNum == -1) break;

            outgoingResult = isPrime(incomingNum);

            dos.writeBoolean(outgoingResult);
        }

        dis.close();
        dos.close();
        soc.close();
        ss.close();
    }    

    public static boolean isPrime(int num) {
        
        for(int i=2; i<= Math.sqrt(num); i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
