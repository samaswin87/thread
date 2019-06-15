package com.thread.concurrent;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureUser {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		UserCallable callable = new UserCallable();
		@SuppressWarnings("unchecked")
		Future<List<User>> future = executor.submit(callable);
		List<User> list = future.get();
		list.forEach(user -> {
			System.out.println(user.getName());
		});
		
		executor.shutdown();
	}

}
