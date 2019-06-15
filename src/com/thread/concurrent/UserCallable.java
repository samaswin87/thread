package com.thread.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class UserCallable implements Callable {

	public List<User> call() throws InterruptedException {
		List<User> list = new ArrayList<User>();
		Thread.sleep(1000);
		User user = new User();
		user.setName("Ashwin");
		list.add(user);
		
		Thread.sleep(1000);
		user = new User();
		user.setName("Raj");
		list.add(user);
		
		Thread.sleep(1000);
		user = new User();
		user.setName("Kavin");
		list.add(user);
		
		return list;
	}
}
