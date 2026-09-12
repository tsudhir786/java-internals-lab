package com.tirumareddy.javalab.qa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstDuplicateCharacter {
    public static void main(String[] args) {
        System.out.println(findFirstDuplicateChar("automation"));
    }

    public static char findFirstDuplicateChar(String input) {

        Set<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {

            if (!seen.add(c)) {
                return c;
            }

        }
        return '\0';
    }
}
