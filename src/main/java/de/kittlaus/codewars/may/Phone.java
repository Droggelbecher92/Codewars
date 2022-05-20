package de.kittlaus.codewars.may;

/*
Write a function that accepts an array of 10 integers (between 0 and 9),
that returns a string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // =>
returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.
Don't forget the space after the closing parentheses!


*/

import java.util.Arrays;

public class Phone {

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder number = new StringBuilder();
        for (int n : numbers) {
            number.append(n);
        }
        return "("+number.substring(0,3)+") "+number.substring(3,6)+"-"+number.substring(6);
    }

}
