package com.ais.newinterfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStrategy strategy = (name) -> "Hello " + name;
		
		System.out.println(strategy.sayHelloTo("Oscar"));
		System.out.println(strategy.sayHelloWorld());
	}
}
