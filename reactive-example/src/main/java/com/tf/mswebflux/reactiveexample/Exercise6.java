package com.tf.mswebflux.reactiveexample;

import java.io.IOException;
import java.time.Duration;

public class Exercise6 {

	public static void main(String[] args) throws IOException {

		// Use ReactiveSources.unresponsiveFlux() and ReactiveSources.unresponsiveMono()

		// Get the value from the Mono into a String variable but give up after 5 seconds
		String block = ReactiveSources.unresponsiveMono().block(Duration.ofSeconds(5));
		
		// If Mono doesn't respond in 5 seconds, it will give up
		// Output - Timeout on blocking read for 5000000000 NANOSECONDS
		
		
		// Get the value from unresponsiveFlux into a String list but give up after 5 seconds
		// Come back and do this when you've learnt about operators!
		String blockFirst = ReactiveSources.unresponsiveFlux()
			.blockFirst(Duration.ofSeconds(5));
		//Output - Timeout on blocking read for 5000000000 NANOSECONDS

		System.out.println("Press a key to end");
		System.in.read();
	}

}
