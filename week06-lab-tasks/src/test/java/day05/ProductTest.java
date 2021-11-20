package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testCreate() {
        Product product = new Product("kenyér", Type.BAKERY, 1.10);

        assertEquals("kenyér", product.getName());
        assertEquals(Type.BAKERY, product.getType());
        assertEquals(1.10, product.getPrice());
    }
}