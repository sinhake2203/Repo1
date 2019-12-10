package com.java.coding.threading.futuretask.prec1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/*
 * FutureTasks are used for tasks that are designed to run once. They have an internal state 
 * that goes from Ready to Running to Ran (or Cancelled). The task will only be executed if the 
 * task is in the Ready state, because running it while in the Running or Ran state could destroy 
 * the internal data result from the first run. There is an alternate run method called runAndReset() 
 * but there isn't a good way to get your executor to use it (and besides, it works by not storing the 
 * results of the run.). We know this because the API for FutureTask says "Once the computation has completed, 
 * the computation cannot be restarted or cancelled (unless the computation is invoked using runAndReset())."
 *  If you want a task that can run multiple times, then you are best off using Callable. 
 * When you submit a task you will be given a Future which you can use to track the outcome, cancel, and get results from. 
 * 
 * 
 */

public class FutureTaskTestClient {

	public static void main(String[] args) {
		
		
		FutureTask<String> f1=new FutureTask<String>(new CustomCallableTask());
		
		FutureTask<String> f2=new FutureTask<String>(new CustomCallableTask());
		
		ExecutorService pool=Executors.newFixedThreadPool(2);
		
		pool.submit(f1);
		//pool.submit(f1);
		pool.submit(f2);
		//pool.submit(f1);
		
		try {
			String result=f1.get();
			
			System.out.println("Result "+result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
