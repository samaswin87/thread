package com.thread.producerconsumer.blocked;

public class App {

	public static void main(String... args) {
		Buffer buffer = new Buffer(5);
		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
