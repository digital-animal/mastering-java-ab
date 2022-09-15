package com.zahid.factorialserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.util.Scanner;

public class FactorialClient {
    public static void main(String[] args)  throws Exception {
        System.out.println("[Client] Starting..");
        Thread.sleep(2000);
        
        Socket soc = new Socket("127.0.0.1", 4923);
        System.out.println("[Client] Requesting for connection..");
        Thread.sleep(2000);
        
        System.out.println("[Client] Connection established..");
        Thread.sleep(2000);
        Scanner sc = new Scanner(System.in);
        System.out.print("# Enter an integer> ");
        int num = sc.nextInt();

        System.out.println("[Client] Sending number..");
        Thread.sleep(2000);
        DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
        dos.writeInt(num);

        System.out.println("[Client] receiving factorial from server..");
        Thread.sleep(2000);
        DataInputStream dis = new DataInputStream(soc.getInputStream());
        int factorial = dis.readInt();

        System.out.printf("%d! = %d\n", num, factorial);
        System.out.println("[Client] Closing connection..");
        Thread.sleep(2000);

        dis.close();
        dos.close();
        sc.close();
        soc.close();
    }

}