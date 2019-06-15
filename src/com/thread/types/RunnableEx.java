package com.thread.types;

public class RunnableEx implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.print("..");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String... args) {
		System.out.println("Thread Running");
		RunnableEx ex = new RunnableEx();
		Thread t = new Thread(ex);
		t.start();
	}
}
