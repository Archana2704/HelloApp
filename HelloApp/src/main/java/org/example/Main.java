package org.example;

public class Main {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        if (nameBuilder.length() > 0) {
            // Remove last ", "
            String result = nameBuilder.substring(0, nameBuilder.length() - 2);
            System.out.println("Hello " + result);
        } else {
            System.out.println("Hello World");
        }
    }
}