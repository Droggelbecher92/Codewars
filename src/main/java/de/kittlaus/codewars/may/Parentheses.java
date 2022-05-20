package de.kittlaus.codewars.may;

/*
Write a function that takes a string of parentheses, and determines if
the order of the parentheses is valid. The function should return true
if the string is valid, and false if it's invalid.

Examples
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"))((()())("  =>  true
Constraints
0 <= input.length <= 100

Along with opening (() and closing ()) parenthesis, input may contain
any valid ASCII characters. Furthermore, the input string may be empty
and/or not contain any parentheses at all. Do not treat other forms
of brackets as parentheses (e.g. [], {}, <>).
*/


public class Parentheses {

    public static boolean validParentheses(String parens) {
        StringBuilder filtered = filterString(parens);
        if (filtered.length()==0) return true;
        if (filtered.length()%2==1) return false;
        return shrinkFiltered(filtered).length()<1;
    }

    private static StringBuilder shrinkFiltered(StringBuilder toShrink) {
        int counter = 0;
        boolean running = true;
        while (running) {
            if (counter + 2 == toShrink.length()) {
                running = false;
            }
            if (toShrink.charAt(counter) == '(' && toShrink.charAt(counter + 1) == ')') {
                toShrink.delete(counter, counter + 2);
                counter = 0;
            } else {
                counter++;
            }
        }
        return toShrink;
    }

    private static StringBuilder filterString(String toFilter){
        StringBuilder checker = new StringBuilder();
        for (char c : toFilter.toCharArray()) {
            if (c=='('||c==')'){checker.append(c);}
        }
        return checker;
    }

}
