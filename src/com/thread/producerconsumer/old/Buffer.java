package com.thread.producerconsumer.old;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	
	private Queue<Integer> list;
	private Integer size;
	
	public Buffer(Integer size) {
		this.size = size;
		this.list = new LinkedList<>();
	}
	
	public void produce() throws InterruptedException {
		Integer value = 0;
		while(true) {
			synchronized (this) {
				while(list.size() == size) {
					wait();
				}
				System.out.println("Added: "+ value);
				list.add(value);
				
				value++;
				
				notify();
				
				Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			synchronized (this) {
				while(list.isEmpty()) {
					wait();
				}
				
				Integer value = list.poll();
				
				System.out.println("Removed: "+ value);
				
				notify();
				
				Thread.sleep(1000);
			}
		}
	}

}
