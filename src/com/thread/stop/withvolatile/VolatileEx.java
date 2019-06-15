package com.thread.stop.withvolatile;

public class VolatileEx {
	
	public static void main(String... args) throws InterruptedException {
		Thread1 t1 = new Thread1(true);
		Thread2 t2 = new Thread2(true);
		
		t1.start();
		t2.start();
		System.out.println("GO.....");
		Thread.sleep(100);
		t1.shutdown(false);
		Thread.sleep(100);
		t2.shutdown(false);
		
	}
}
