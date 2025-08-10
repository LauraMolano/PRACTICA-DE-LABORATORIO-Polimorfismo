package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    /**
     * Caso normal: Side 2.0
     */
    @Test
    public void testSide2() {
        System.out.println("Side 2.0");
        Square instance = new Square(2.0);

        double expPerimeter = 2.0 * 4;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = 2.0 * 2.0;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }

    /**
     * Caso límite: Side 0
     */
    @Test
    public void testSide0() {
        System.out.println("Side 0");
        Square instance = new Square(0.0);

        double expPerimeter = 0.0;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = 0.0;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }

    /**
     * Caso decimal: Side 1.75
     */
    @Test
    public void testSideDecimal() {
        System.out.println("Side 1.75");
        Square instance = new Square(1.75);

        double expPerimeter = 1.75 * 4;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = 1.75 * 1.75;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }
}
