package com.thread.stop.withatomic;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadWorker extends Thread {

	private final AtomicBoolean running = new AtomicBoolean(false);
	
	public void run() {
		running.set(true);
		while(running.get()) {
			System.out.println("*********************** wait");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running.set(false);
	}
	
}
