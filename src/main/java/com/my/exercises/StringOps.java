package com.my.exercises;

public class StringOps {
    public static void main (String[] args) {
        String txt = "AbCdEfGhIjKlMnOpQrStUvWxYz";

        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("jKlMn")); //has to be same case

        String firstName = "Nimasha ";
        String lastName = "Fernandopulle";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String doubleQuotes = "I am \"the\" best hardworker";
        System.out.println(doubleQuotes);

        String apostrophie = "It\'s alright.";
        System.out.println(apostrophie);

        String backslash = "The character \\ is called backslash.";
        System.out.println(backslash);

        String escapeSequence = "This is a backspace\b character.";
        System.out.println(escapeSequence);

        String tab = "This is a tab\tcharacter.";
        System.out.println(tab);

        String newLine = "This is a new line\ncharacter.";
        System.out.println(newLine);

        String carriageReturn = "This is a carriage return\rcharacter.";
        System.out.println(carriageReturn);

        String formFeed = "This is a form feed\fcharacter.";
        System.out.println(formFeed);



    }
}
