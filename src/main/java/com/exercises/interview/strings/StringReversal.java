package com.exercises.interview.strings;

import org.springframework.stereotype.Controller;

@Controller
public class StringReversal {

    //TODO - update method
    public static String reverseString(String str) {
        return str;
    }

    public static void main(String[] args) {
        String input = "drawer";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }


}