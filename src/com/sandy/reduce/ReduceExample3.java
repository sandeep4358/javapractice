package com.sandy.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample3 {
	public static void main(String[] args) {
		// Create a list of numbers either positve or negative  
        List<Integer> numbers = Arrays.asList(8, -4, 16, 0, 1, -6, 3);   
        // calculate sum of all the elements of the numbers array using the reduce method   
 
        Optional<Integer> sum = numbers.stream().reduce((firstNumber,secondNumber)->firstNumber+secondNumber);
        Integer total  = numbers.stream().reduce(0,(firstNumber,secondNumber)->firstNumber+secondNumber);
        System.out.println(total);
	}
}
