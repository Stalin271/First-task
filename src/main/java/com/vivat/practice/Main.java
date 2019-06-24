package com.vivat.practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the string what will have a numbers (if you want): ");
    String input = scanner.nextLine();
		try {
        System.out
                .println(String.format("Before you have '%s', now your sting is '%s', THIS IS REVOLUTION JOHNY!!!",
                        input, removeNumbers(input)));

    } catch (Bad_Value ex) {
        System.out.println(ex.getMessage());
    }
		scanner.close();
}
    public static String removeNumbers(String input) {
        input = input.replaceAll("[^A-Za-z]", "");
        return input;
    }
}
