package org.example;

public class Main {
    public static void main(String[] args) {

        String names = "World";

        // If arguments are provided
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}