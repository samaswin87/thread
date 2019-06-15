package com.thread.producerconsumer.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String... args) {
		Buffer buffer = new Buffer(5);
		ExecutorService executor = Executors.newFixedThreadPool(5);
		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);
		
		executor.execute(producer);
		executor.execute(consumer);
		
		executor.shutdown();
	}
}
