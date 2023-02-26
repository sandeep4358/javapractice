package com.sandy.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ResuceExample1 {
	
	public static void main(String[] args) {
		 // create a list of names to perform operations  
		List<String> students = Arrays.asList("Emma Watson", "Paul Walker", "Leesa",   
                "James", "Lilly");
        // The reduce() method takes the lambda expression that take two string type values and returns a longer string  
        //The Optional data is returned as a result from the reduce() method because the list can be emplty on which reduce() method is called.  
		
		Optional<String> newString = students.stream().reduce((firstName, secondName)-> firstName.length() > secondName.length()? firstName : secondName);
        // show the result returned by the reduce method  

		newString.ifPresent(System.out::println);
		

	}
}
