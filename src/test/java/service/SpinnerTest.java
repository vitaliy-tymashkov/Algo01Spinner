package service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SpinnerTest {

    @Test
    void spinArrayThenPositive12345Spin3ShouldReturn34512() {
        int[] input = new int[] {1,2,3,4,5};
        int[] expected = new int[] {3,4,5,1,2};
        int spin = 3;
        int[] result = Spinner.spinArrayTvv01(input, spin);
        assertArrayEquals(expected, result);
    }
    @Test
    void spinArrayThenPositive12345Spin2ShouldReturn45123() {
        int[] input = new int[] {1,2,3,4,5};
        int[] expected = new int[] {4,5,1,2,3};
        int spin = 2;
        int[] result = Spinner.spinArrayTvv01(input, spin);
        assertArrayEquals(expected, result);
    }
    @Test
    void spinArrayThenPositive1234567890Spin22ShouldReturn891234567() {
        int[] input = new int[] {1,2,3,4,5,6,7,8,9,0};
        int[] expected = new int[] {9,0,1,2,3,4,5,6,7,8};
        int spin = 22;
        int[] result = Spinner.spinArrayTvv01(input, spin);
        assertArrayEquals(expected, result);
    }
    @Test
    void spinArrayThenPositive123456789Spin2ShouldReturn891234567() {
        int[] input = new int[] {1,2,3,4,5,6,7,8,9};
        int[] expected = new int[] {8,9,1,2,3,4,5,6,7};
        int spin = 2;
        int[] result = Spinner.spinArrayTvv01(input, spin);
        assertArrayEquals(expected, result);
    }
    @Test
    void spinArrayThenPositive12345SpinMoreThanSize8ShouldReturn34512() {
        int[] input = new int[] {1,2,3,4,5};
        int[] expected = new int[] {3,4,5,1,2};
        int spin = 8;
        int[] result = Spinner.spinArrayTvv01(input, spin);
        assertArrayEquals(expected, result);
    }
}