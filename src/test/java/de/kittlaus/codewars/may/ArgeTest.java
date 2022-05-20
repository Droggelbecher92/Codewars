package de.kittlaus.codewars.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArgeTest {


    @Test
    void testcase1(){
        int expected = 15;
        int actual = Arge.nbYear(1500, 5, 100, 5000);
        assertEquals(expected,actual);
    }

    @Test
    void testcase2(){
        int expected = 10;
        int actual = Arge.nbYear(1500000, 2.5, 10000, 2000000);
        assertEquals(expected,actual);
    }

    @Test
    void testcase3(){
        int expected = 94;
        int actual = Arge.nbYear(1500000, 0.25, 1000, 2000000);
        assertEquals(expected,actual);
    }
}