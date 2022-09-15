package com.zahid.pipedproducerconsumer;

import java.io.IOException;
import java.io.OutputStream;

public class ProducerThread extends Thread {
	OutputStream os;

	public ProducerThread(OutputStream os) {
		this.os = os;
	}

	@Override
	public void run() {
		
		int count = 1;
		while(true) {
			try {
				os.write(count);
				os.flush();
				
				System.out.println("# Producer Produced: "+count);
				System.out.flush();
				
				Thread.sleep(10);
				count++;
				
			} catch (IOException e) {
				
				System.out.println(e);
				
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
	}

}
