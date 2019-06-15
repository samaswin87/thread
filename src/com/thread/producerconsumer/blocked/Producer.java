package com.thread.producerconsumer.blocked;

public class Producer extends Thread {
	
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		
		try {
			buffer.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
