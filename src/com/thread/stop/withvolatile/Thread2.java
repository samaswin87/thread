package com.thread.stop.withvolatile;

public class Thread2 extends Thread {
	
	private volatile boolean flag;
	
	public Thread2(boolean flag) {
		this.flag = flag;
	}

	public void run() {
		while(flag) {
			System.out.println("........................ wait");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(boolean flag) {
		this.flag = flag;
	}
}
