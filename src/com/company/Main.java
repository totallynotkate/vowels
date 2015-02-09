package com.company;

public class Main {

    public static void main(String[] args) {
	    String textToCheck = new String ("I want to know the number of vowels in this string.");
        System.out.println("We're counting vowels in a string \"" +textToCheck +"\"");
        textToCheck = textToCheck.toLowerCase();
        int vowelCounter = 0;
        for (int i = 0; i < textToCheck.length(); i++){
            char test = textToCheck.charAt(i);
            if ((test == 'a') || (test == 'e') || (test == 'i') || (test == 'o') || (test == 'u')) {
                vowelCounter++;
            }
        };
        System.out.println("The number of vowels in the string is " + vowelCounter + ".");
    }
}
