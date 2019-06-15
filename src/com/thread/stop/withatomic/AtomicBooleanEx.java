package com.thread.stop.withatomic;

public class AtomicBooleanEx {
	
	public static void main(String... args) throws InterruptedException {
		ThreadWorker t1 = new ThreadWorker();
		
		t1.start();
		System.out.println("GO.....");
		Thread.sleep(100);
		t1.shutdown();
	}
}
