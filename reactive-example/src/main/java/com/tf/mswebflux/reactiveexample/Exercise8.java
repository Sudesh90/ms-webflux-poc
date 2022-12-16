
package com.tf.mswebflux.reactiveexample;

import java.io.IOException;

import reactor.core.publisher.Flux;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
//         ReactiveSources.intNumbersFluxWithException()
//        	.subscribe(num -> System.out.println(num));
       // Response - ERROR reactor.core.publisher.Operators - Operator called default onErrorDropped
       // if (e == 5) throw new RuntimeException("An error happened in the flux"); from Flux
        
       // Another way to throw an error - do subscribe() when error happens
//          ReactiveSources.intNumbersFluxWithException()
//        	.doOnError(e -> System.out.println(e.getMessage()))
//        	.subscribe(num -> System.out.println(num));
        
        
        // Print values from intNumbersFluxWithException and continue on errors
//           ReactiveSources.intNumbersFluxWithException()
//           		.onErrorContinue((err, item) -> System.out.println("Error happend!"+err.getMessage()))
//           		.subscribe(num -> System.out.println(num));
           // Output - 1 2 3 4 Error happend!An error happened in the flux 6 7 8 9 10
           // At 5 Flux throws an error, that's why it is not printing 5 but still continue

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
           ReactiveSources.intNumbersFluxWithException()
           		.onErrorResume(err -> Flux.just(-1, -2)) //When error happens, creating new Flux with element -1 & -2
           		.subscribe(System.out::println);
        // Output - 1 2 3 4 -1 -2, here at 5 Flux throws an error
        // and from there, it replaces the rest of the elements (6 7 8 9 10) with -1 & -2

        System.out.println("Press a key to end");
        System.in.read();
    }

}
