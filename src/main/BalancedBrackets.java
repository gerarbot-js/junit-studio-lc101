package main;


import java.util.ArrayList;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        ArrayList<Character> bracketArrayList = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
        }

        for (char ch : str.toCharArray()) {
            if (ch == '[' && bracketArrayList.size() % 2 == 0) {
                bracketArrayList.add(ch);
            } else if (ch == ']' && bracketArrayList.size() % 2 == 1) {
                bracketArrayList.add(ch);
            }
        }

       return bracketArrayList.size() % 2 == 0 && brackets == 0;

        //return brackets == 0;
    }
}
