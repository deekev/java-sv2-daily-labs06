package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {

    @Test
    void testCreate() {
        ProductWithPiece productWithPiece = new ProductWithPiece(Type.VEGETABLE);

        assertEquals(Type.VEGETABLE, productWithPiece.getType());
        assertEquals(1, productWithPiece.getCount());
    }

    @Test
    void testIncrementCount() {
        ProductWithPiece productWithPiece = new ProductWithPiece(Type.FROZEN);

        productWithPiece.incrementCount();
        assertEquals(2,productWithPiece.getCount());

        productWithPiece.incrementCount();
        assertEquals(3,productWithPiece.getCount());
    }
}