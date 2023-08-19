package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream().forEach(number -> System.out.print(number + " "));

        System.out.println();
        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .filter(number -> number < 5)
                .forEach(number -> System.out.print(number + " "));

        System.out.println();
        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .filter(number -> number < 5)
                .skip(1)
                .limit(2)
                .forEach(number -> System.out.print(number + " "));

        System.out.println();
        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer result = StreamSources.intNumbersStream()
                .filter(number -> number > 5)
                .findFirst()
                .orElse(-1);

        System.out.print(result);

        System.out.println();
        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream().forEach(user -> System.out.print(user.getFirstName() + " "));

        System.out.println();
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(id -> id == user.getId()))
                .forEach(user -> System.out.print(user.getFirstName() + " "));

//        System.out.println();
//        StreamSources.intNumbersStream()
//                .flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
//                .map(user -> user.getFirstName())
//                .forEach(firstName -> System.out.print(firstName + " "));

    }

}
