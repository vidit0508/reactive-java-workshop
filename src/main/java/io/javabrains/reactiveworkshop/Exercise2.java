package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        // ReactiveSources.intNumbersFlux().toStream().forEach(number -> System.out.print(number + " "));

        ReactiveSources.intNumbersFlux().subscribe(number -> System.out.print(number + " "));
//        Flux<Integer> stream = ReactiveSources.intNumbersFlux();
//        stream.subscribe(number -> System.out.println(number + " "));
//        stream.subscribe(number -> System.out.println("Another one " + number));

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(user -> System.out.println(user));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
