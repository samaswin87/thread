package com.thread.stop.withinterupt;

public class InteruptEx {

	public static void main(String[] args) throws InterruptedException {
		ThreadWorker t = new ThreadWorker();
		t.start();
		Thread.sleep(1000);
		
		t.interrupt();
	}

}
