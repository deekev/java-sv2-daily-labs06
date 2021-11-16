package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


class PerfectNumbersTest {

    @Test
    void testIsPerfectNumber() {
        assertTrue(new PerfectNumbers().isPerfectNumber(6));
        assertTrue(new PerfectNumbers().isPerfectNumber(8128));
        assertFalse(new PerfectNumbers().isPerfectNumber(7246));
        assertFalse(new PerfectNumbers().isPerfectNumber(9));
    }
}