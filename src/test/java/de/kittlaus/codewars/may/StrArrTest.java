package de.kittlaus.codewars.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrArrTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, StrArr.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, StrArr.stringToArray("I love arrays they are my favorite"));
    }

}