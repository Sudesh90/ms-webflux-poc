package com.tf.mswebflux.reactiveexample;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.Disposable;
import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks - 1
      /*  ReactiveSources.intNumbersFlux()
        	.subscribe( 
        			number -> System.out.println(number),
        			err -> System.out.println(err.getMessage()),
        			() -> System.out.println("Complete")
        			);
        // Subscribe to a flux using the error and completion hooks - 1
        // Not recommended as it has been deprecated
        Disposable subscribe =
        	ReactiveSources.intNumbersFlux()
        	.subscribe( 
        			number -> System.out.println(number),
        			err -> System.out.println(err.getMessage()),
        			() -> System.out.println("Complete"),
        			subscriber -> {
        				System.out.println("subscriber -> Complete");
        			}
        			);
	*/
        // Subscribe to a flux using an implementation of BaseSubscriber
        // Another way to use subscribe()
        ReactiveSources.intNumbersFlux()
        	.subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber<T> extends BaseSubscriber<T>{
	public void hookOnSuscribe(Subscription subscription) {
		System.out.println("Subscribe happend");
		request(1);
	}
	public void hookOnNext(T value) {
		System.out.println(value.toString()+" received");
//		request(1);
		
	}
}