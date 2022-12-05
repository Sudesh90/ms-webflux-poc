package com.tf.mswebflux.reactiveexample;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Streams;

public class Exercise1 {

    public static void main(String args[]) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream()
            .forEach(System.out::println);
             
        }
}
