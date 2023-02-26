package com.sandy.reduce;

import java.util.stream.IntStream;

public class ResduceExample4 {
	public static void main(String[] args) {
        // calculate the product of elements that comes in given range excluding the rightmost element   
		int productOfElements = IntStream.range(5, 12).reduce((f,s)->f*s).orElse(-1);
		// show the result returned by the reduce method  
        System.out.println("The product of all the elements come in given range is: " + productOfElements);   
	}
}
