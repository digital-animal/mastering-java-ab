package com.zahid.pipedproducerconsumer;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedTest {

	public static void main(String[] args) throws IOException {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();

		pos.connect(pis);
//		pis.connect(pos);
		
		ProducerThread p = new ProducerThread(pos);
		ConsumerThread c = new ConsumerThread(pis);
		
		p.start();
		c.start();
	}

}
