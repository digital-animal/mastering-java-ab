package com.zahid.pipedproducerconsumer;

import java.io.IOException;
import java.io.InputStream;

public class ConsumerThread extends Thread {

	InputStream is;
	public ConsumerThread(InputStream is) {
		this.is = is;
	}

	@Override
	public void run() {
		
		int x;
		while(true) {
			try {
				x = is.read();
				System.out.println("# Consumer Consumed: "+x);
				System.out.flush();
				
				Thread.sleep(10);
				
			} catch (IOException e) {
				
				System.out.println(e);
				
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
	}
}
    	
 