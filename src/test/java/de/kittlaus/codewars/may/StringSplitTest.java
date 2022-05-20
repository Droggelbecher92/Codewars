package de.kittlaus.codewars.may;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitTest {

    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        String[] act1= StringSplit.solution(s);
        assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
        assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
    }

}