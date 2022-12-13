package com.tf.mswebflux.reactiveexample;

import java.io.IOException;
import java.util.List;

import reactor.core.publisher.Mono;

public class Exercise2 {

    public static void main(String args[]) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream 
		ReactiveSources.
			intNumbersFlux() //subscribe() is like for-each of streams
			.subscribe(e -> System.out.println(e));
                
		/*Unlike for-each, instead of fetching all the elements
		 * here, if it finds a new element/number (event is generated)
		 * and ask run subscribe() for each element/generated-event
		 */
		
		
        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux()
        	.subscribe(user -> System.out.println(user));
   
        System.out.println("Press a key to end");
        System.in.read();
        
        /* output - shows, Flux is executing in parallel asynchronously
         * It is not sequential anymore unlike streams
        Press a key to end
        1
        User{id=1, firstName='Lionel', lastName='Messi'}
        2
        User{id=2, firstName='Cristiano', lastName='Ronaldo'}
        3
        User{id=2, firstName='Diego', lastName='Maradona'}
        4
        User{id=4, firstName='Zinedine', lastName='Zidane'}
        5
        User{id=5, firstName='Jürgen', lastName='Klinsmann'}
        6
        User{id=6, firstName='Gareth', lastName='Bale'}
        7
        8
        9
        10
        */
    }

}
