package com.thread.producerconsumer.old;

public class Consumer extends Thread {
	
	private Buffer buffer;
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		try {
			buffer.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
