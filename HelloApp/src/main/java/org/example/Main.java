package org.example;
public class Main {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Using StringBuilder to build the greeting
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Display final output
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}