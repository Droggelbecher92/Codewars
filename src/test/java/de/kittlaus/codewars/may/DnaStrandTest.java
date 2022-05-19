package de.kittlaus.codewars.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DnaStrandTest {

    @Test
    void testcase1(){
        //Given
        String input = "";
        String expected = "";
        //When
        String actual = DnaStrand.makeComplement(input);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void testcase2(){
        //Given
        String input = "ATGC";
        String expected = "TACG";
        //When
        String actual = DnaStrand.makeComplement(input);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void testcase3(){
        //Given
        String input = "GTAT";
        String expected = "CATA";
        //When
        String actual = DnaStrand.makeComplement(input);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void testcase4(){
        //Given
        String input = "AAAA";
        String expected = "TTTT";
        //When
        String actual = DnaStrand.makeComplement(input);
        //Then
        assertEquals(expected,actual);
    }

}