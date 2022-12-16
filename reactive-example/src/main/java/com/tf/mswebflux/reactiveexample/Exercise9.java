package com.tf.mswebflux.reactiveexample;

import java.io.IOException;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
//           ReactiveSources.intNumbersFlux()
//           		.count()
//           		.subscribe(System.out::println);
    	
        // Output - 10, it waited until it subscribed till last element which is 10 and total count is also 10

        // Collect all items of intNumbersFlux into a single list and print it
//           ReactiveSources.intNumbersFlux()
//           		.collectList()
//           		.subscribe(System.out::println);
    	
        // Output - It is collecting all the elements in the collection list
        // When subscribing the last elements and print the whole collection at once

        // Transform to a sequence of sums of adjacent two numbers
           ReactiveSources.intNumbersFlux()
           		.buffer(2)
           		.map(list -> list.get(0) + list.get(1))
           		.subscribe(System.out::println);
       // Response - 3 7 11 15 19

        System.out.println("Press a key to end");
        System.in.read();
    }

}
