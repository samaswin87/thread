package com.thread.stop.withinterupt;

public class ThreadWorker extends Thread {
	
	public void run() {
		while(!Thread.interrupted()) {
			System.out.print("*");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
	}
	
}
