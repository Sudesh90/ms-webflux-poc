package com.tf.mswebflux.reactiveexample;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String args[]) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono()
        	.subscribe(number -> System.out.println(number));

        // Get the value from the Mono into an integer variable
        Integer integerMono = ReactiveSources.intNumberMono()
        	.block();
        System.out.println("Mono into an integer value "+integerMono);
       
        Optional<Integer> integerOptional = ReactiveSources.intNumberMono()
        	.blockOptional();
        System.out.println("Mono into an optional value "+integerOptional);

        // Get the value from the Mono into User variable
        User user = ReactiveSources.userMono()
        			.block();
        System.out.println("User user "+user);
        
        //Another way of using subscribe()
        ReactiveSources.intNumberMono()
        	.subscribe(
        		number-> System.out.println(number),
        		err-> System.out.println(err.getMessage()),
        		() -> System.out.println("Complete")
        		);
        
        System.out.println("Press a key to end");
        System.in.read();
        
        /* output/response - 
         * Mono into an integer value 42
			42
			Mono into an optional value Optional[42]
			User user User{id=1, firstName='Lionel', lastName='Messi'}
			Press a key to end
			42
			Complete
         */
    }

}
