package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {
    @Test
    public void flattenArrayTest() {
        Q1 q1 = new Q1();
        int[][] 2DArray = {
                {1, 3},
                {0},
                {4, 5, 9}
        };

        int[] array = q1.flattenArray(2DArray);
        int[] expectedArr = {1,3,0,4,5,9};
        assertArrayEquals(expectedArr, array);
    }
    @Test
    public void flattenArrayNullTest() {
        Q1 q1 = new Q1();
        int[] arr = q1.flattenArray(null);
        assertNull(arr);
    }
}