package com.sandy.reduce;

import java.util.Arrays;
import java.util.Optional;

public class ResduceExample2 {
	public static void main(String[] args) {
		 // create a array of monuments to perform operations   
        String[] monuments = { "Taj Mahal", "Qutab Minar", "Konark Sun Temple", "India Gate", "Charminar" };   
        // The reduce() method takes the lambda expression that take two string type values and returns a longer string  
        //The Optional data is returned as a result from the reduce() method because the list can be emplty on which reduce() method is called.  
        Optional<String> largestNamedMonument = Arrays.stream(monuments).reduce((firstString,secondString)->firstString+"-"+secondString);
        
        largestNamedMonument.ifPresent(System.out::println);
        
	}
}
