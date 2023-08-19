package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
//        ReactiveSources.intNumbersFlux().subscribe(
//                number -> System.out.println(number + " "),
//                err -> System.out.println(err.getMessage()),
//                () -> System.out.println("Completed")
//        );

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber<T> extends BaseSubscriber<T> {
    @Override
    protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscription happened!!!");
        request(1);
        // super.hookOnSubscribe(subscription);
    }

    @Override
    protected void hookOnNext(T value) {
        System.out.println(value.toString() + " next happened!!!");
        request(1);
        // super.hookOnNext(value);
    }

    @Override
    protected void hookOnComplete() {
        System.out.println("completion happened!!!");
        super.hookOnComplete();
    }

}