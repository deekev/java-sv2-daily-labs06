package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


class PerfectNumbersTest {

    @Test
    void testIsPerfectNumber() {
        PerfectNumbers perfectNumbers = new PerfectNumbers();

        assertTrue(perfectNumbers.isPerfectNumber(6));
        assertTrue(perfectNumbers.isPerfectNumber(8128));

        assertFalse(perfectNumbers.isPerfectNumber(7246));
        assertFalse(perfectNumbers.isPerfectNumber(9));
    }
}