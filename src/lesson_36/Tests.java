package lesson_36;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
public class Tests {

    @Test
    public void test1Task() {
        Integer[] input = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Integer[] expected = {2, 4, 6, 8, 1, 3, 5, 7, 7, 9};
        IntsComparable intsComparable = new IntsComparable();
        Integer[] resultInts = intsComparable.firstTaskSort(input);
        assertArrayEquals(expected, resultInts);
    }
    @Test
    public void test2Taskv1() {
        Integer[] input = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Integer[] expected = { 2, 4, 6, 8, 9, 7, 7, 5, 3, 1 };
        IntsComparable intsComparable = new IntsComparable();
        Integer[] resultInts = intsComparable.secondTaskSortV1(input);
        assertArrayEquals(expected, resultInts);
    }
    @Test
    public void test2Taskv2() {
        Integer[] input = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Integer[] expected = { 2, 4, 6, 8, 9, 7, 7, 5, 3, 1 };
        IntsComparable intsComparable = new IntsComparable();
        Integer[] resultInts = intsComparable.secondTaskSortV2(input);
        assertArrayEquals(expected, resultInts);
    }

    
}