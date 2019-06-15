package com.thread.producerconsumer.blocked;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Buffer {
	
	private BlockingQueue<Integer> list;
	
	public Buffer(Integer size) {
		this.list = new LinkedBlockingDeque<Integer>(size);
	}
	
	public void produce() throws InterruptedException {
		Integer value = 0;
		while(true) {
			list.add(value);
			System.out.println("Added: "+ value);
			
			value ++;
			
			Thread.sleep(1000);
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			Integer value = list.take();
			
			System.out.println("Removed: "+ value);
			
			Thread.sleep(1000);
		}
	}

}
