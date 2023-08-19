package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        // ReactiveSources.intNumberMono().subscribe(number -> System.out.println(number));
        ReactiveSources.intNumberMono()
                .subscribe(
                        number -> System.out.println(number),
                        err -> System.out.println(err.getMessage()),
                        () -> System.out.println("Complete"));


        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        Optional<Integer> result = ReactiveSources.intNumberMono().blockOptional();
        if (result.isPresent()) {
            System.out.println("Number is = " + result.get());
        }

//        System.out.println("Press a key to end");
//        System.in.read();
    }

}
