package de.kittlaus.codewars.may;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PaginationHelperTest {

    @Test
    void shouldReturnLengthOfList(){
        //GIVEN
        List<String> items = List.of("Item1","Item2","Item3","Item4","Item5","Item6");
        int itemsPerPage = 2;
        PaginationHelper<String> testHelper = new PaginationHelper<>(items,itemsPerPage);
        int expected = 6;

        //WHEN
        int actual = testHelper.itemCount();
        //THEN
        assertEquals(expected,actual);
    }


    @Test
    void shouldBePageCount3with6ItemsAnd2PerPage() {
        //GIVEN
        List<String> items = List.of("Item1","Item2","Item3","Item4","Item5","Item6");
        int itemsPerPage = 2;
        PaginationHelper<String> testHelper = new PaginationHelper<>(items,itemsPerPage);
        int expected = 3;

        //WHEN
        int actual = testHelper.pageCount();
        //THEN
        assertEquals(expected,actual);

    }

    @Test
    void shouldBePageCount3with5ItemsAnd2PerPage() {
        //GIVEN
        List<String> items = List.of("Item1","Item2","Item3","Item4","Item5");
        int itemsPerPage = 2;
        PaginationHelper<String> testHelper = new PaginationHelper<>(items,itemsPerPage);
        int expected = 3;

        //WHEN
        int actual = testHelper.pageCount();
        //THEN
        assertEquals(expected,actual);

    }

    @Test
    void pageItemCountShouldReturn1With5ItemsOnPage3() {
        //GIVEN
        List<String> items = List.of("Item1","Item2","Item3","Item4","Item5");
        int itemsPerPage = 2;
        PaginationHelper<String> testHelper = new PaginationHelper<>(items,itemsPerPage);
        int expected = 1;

        //WHEN
        int actual = testHelper.pageItemCount(3);
        //THEN
        assertEquals(expected,actual);
    }

    @Test
    void pageItemCountShouldReturn1With6ItemsOnPage3() {
        //GIVEN
        List<String> items = List.of("Item1","Item2","Item3","Item4","Item5","Item6");
        int itemsPerPage = 2;
        PaginationHelper<String> testHelper = new PaginationHelper<>(items,itemsPerPage);
        int expected = 2;

        //WHEN
        int actual = testHelper.pageItemCount(3);
        //THEN
        assertEquals(expected,actual);
    }

    @Test
    void pageItemCountShouldReturnNegativeWith4ItemsOnPage3() {
        //GIVEN
        List<String> items = List.of("Item1","Item2","Item3","Item4");
        int itemsPerPage = 2;
        PaginationHelper<String> testHelper = new PaginationHelper<>(items,itemsPerPage);
        int expected = -1;

        //WHEN
        int actual = testHelper.pageItemCount(3);
        //THEN
        assertEquals(expected,actual);
    }

    @Test
    void pageIndex() {
    }
}