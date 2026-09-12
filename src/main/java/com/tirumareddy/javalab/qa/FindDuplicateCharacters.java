package com.tirumareddy.javalab.qa;

import java.util.*;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        System.out.println(findDuplicateCharacters("swiss"));
    }

    public static Set<Character> findDuplicateCharacters(String input) {

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicateSet = new LinkedHashSet<>();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {

            if (!seen.add(c)) {
                duplicateSet.add(c);
            }
        }
        return (duplicateSet);
    }
}
