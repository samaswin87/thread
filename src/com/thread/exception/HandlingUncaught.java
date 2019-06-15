package com.thread.exception;

public class HandlingUncaught extends Thread {
	
	public void run() {
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		HandlingUncaught ex = new HandlingUncaught();
		ex.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t.getName());
				System.out.println(e);
			}
		});
		ex.start();
	}

}
