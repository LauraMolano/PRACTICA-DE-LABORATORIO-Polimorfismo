package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    public TriangleTest() {
    }

    /**
     * Caso normal: base 3 (triangulo equilatero)
     */
    @Test
    public void testBase3() {
        System.out.println("Base 3");
        Triangle instance = new Triangle(3);

        double expPerimeter = 3 * 3.0;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = (Math.sqrt(3) / 4.0) * 3.0 * 3.0;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }

    /**
     * Caso límite: base 0 (equilatero)
     */
    @Test
    public void testBase0() {
        System.out.println("Base 0");
        Triangle instance = new Triangle(0);

        double expPerimeter = 0.0;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = 0.0;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }

    /**
     * Caso decimal: base 4.2 (equilatero)
     */
    @Test
    public void testBaseDecimal() {
        System.out.println("Base 4.2");
        Triangle instance = new Triangle(4.2);

        double expPerimeter = 3 * 4.2;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = (Math.sqrt(3) / 4.0) * 4.2 * 4.2;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }

}
