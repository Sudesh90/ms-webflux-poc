package com.tf.mswebflux.reactiveexample;

import java.io.IOException;
import java.util.List;

import reactor.core.publisher.Mono;

public class Exercise2 {

    public static test() {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        Mono<List<Integer>> nlist = ReactiveSources.
            intNumbersFlux()
            // .filter(ele -> ele > 5)
            .collectList();



        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
