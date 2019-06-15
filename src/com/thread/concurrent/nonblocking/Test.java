package com.thread.concurrent.nonblocking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) {
		final Counter counter = new Counter();
        List<Future<Integer>> list = new ArrayList<Future<Integer>>();
        
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 500; i++) {
            Callable<Integer> worker = new  Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int number = counter.increment();
                    System.out.println(number);
                    return number;
                }
            };
            Future<Integer> submit= executor.submit(worker);
            list.add(submit);

        }
        
        executor.shutdown();
        System.out.println("Terminating");
        while (!executor.isTerminated()) {
        	System.out.print(".");
        }
        
        for (Future<Integer> future : list) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        
        

	}

}
