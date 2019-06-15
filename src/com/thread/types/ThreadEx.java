package com.thread.types;

public class ThreadEx extends Thread {
	
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
		ThreadEx ex = new ThreadEx();
		ex.start();
	}
}
