package de.kittlaus.codewars.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3And5Test {

    @Test
    void shouldReturn23With10(){
        //Given
        int number = 10;
        int expected = 23;
        //When
        int actual = MultiplesOf3And5.solution(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturn14With8(){
        //Given
        int number = 8;
        int expected = 14;
        //When
        int actual = MultiplesOf3And5.solution(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturn0WithNegative(){
        //Given
        int number = -8;
        int expected = 0;
        //When
        int actual = MultiplesOf3And5.solution(number);
        //Then
        assertEquals(expected,actual);
    }

}