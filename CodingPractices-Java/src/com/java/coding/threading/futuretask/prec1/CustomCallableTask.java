package com.java.coding.threading.futuretask.prec1;

import java.util.concurrent.Callable;

public class CustomCallableTask implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("Hello");
		return "String1";
	}

}
