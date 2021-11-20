package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @BeforeEach
    void initStore() {
        store.addProduct(new Product("kenyér", Type.BAKERY, 1.10));
        store.addProduct(new Product("kifli", Type.BAKERY, 0.15));
    }

    @Test
    void testAddProduct() {
        store.addProduct(new Product("alma", Type.FRUIT, 0.85));
        assertEquals(3, store.getProducts().size());
        assertEquals("alma", store.getProducts().get(2).getName());
    }

    @Test
    void testNumberOfProductsByTypeWithOneType() {
        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(1, result.size());
        assertEquals(Type.BAKERY, result.get(0).getType());
        assertEquals(2, result.get(0).getCount());
    }

    @Test
    void testNumberOfProductsByTypeWithEmptyList() {
        Store store = new Store();
        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(0, result.size());
    }

    @Test
    void testNumberOfProductsByTypeWithMoreTypes() {
        store.addProduct(new Product("alma", Type.FRUIT, 0.85));
        store.addProduct(new Product("banán", Type.FRUIT, 1.30));
        store.addProduct(new Product("csirkemell", Type.MEAT, 3.25));

        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(3, result.size());
        assertEquals(2, result.get(0).getCount());
        assertEquals(Type.FRUIT, result.get(1).getType());
        assertEquals(1, result.get(2).getCount());
    }
}