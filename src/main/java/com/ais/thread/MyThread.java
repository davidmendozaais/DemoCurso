package com.ais.thread;

import com.ais.util.MethodInfo;;

public class MyThread extends Thread {
	
	@Override
	@MethodInfo(comments = "New Thread Class", date = "30/11/2017")
	public void run(){
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
	
}
