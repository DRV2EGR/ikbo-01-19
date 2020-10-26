package ru.mirea.ikbo01_19.lab12.Rogov;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sloving_lab12 {

    public static void main(String[] args) {
        String input = "3 USD";

        myMatches("([1-9]*) USD", input);

    }


    public static void myMatches(String regex,
                                 String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()) {
            System.out.println(matcher.group());
        } else
            System.out.println("nothing");
        System.out.println();
    }

}
