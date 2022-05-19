package de.kittlaus.codewars.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringEndsWithTest {


    @Test
    void shouldBeTrueWithAbcAndBc(){
        //Given

        String s1 = "abc";
        String s2 = "bc";

        //When
        boolean actual = StringEndsWith.solution(s1,s2);
        //Then
        assertTrue(actual);
    }

    @Test
    void shouldBeFalseWithAbcAndD(){
        //Given

        String s1 = "abc";
        String s2 = "d";

        //When
        boolean actual = StringEndsWith.solution(s1,s2);
        //Then
        assertFalse(actual);
    }

    @Test
    void shouldBeTrueWithEqualStrings(){
        //Given

        String s1 = "abc";
        String s2 = "abc";

        //When
        boolean actual = StringEndsWith.solution(s1,s2);
        //Then
        assertTrue(actual);
    }

}