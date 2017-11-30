package com.ais.functional;

import java.util.function.Function;

public class AwesomeClass {
	/*
	private static Integer invert(Integer value){
		return -value;
	}
	*/
	public static Integer invertTheNumber(){
		Integer toInvert = 5;
		return compute(value -> -value, toInvert);
		/*
		Function<Integer, Integer> invertFunction = AwesomeClass::invert;
		return compute(invertFunction, toInvert);
		*/
	}
	
	public static Integer compute(Function<Integer, Integer> function, Integer value){
		return function.apply(value);
	}
	
}
