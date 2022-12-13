package com.tf.mswebflux.reactiveexample;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String args[]) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        
    	List<Integer> numberList =
    		ReactiveSources.intNumbersFlux()
    		.toStream()
    		.toList();
    	System.out.println(numberList);
    	
    	System.out.println("Size "+ numberList.size());

		/* by the time, after converting it to Stream to List and assign 
		 * it to numberList, makes sure that it has all the elemement so 
		 * below is not needed
		 * System.out.println("Press a key to end"); 
		 * System.in.read();
		 */
    }

}
