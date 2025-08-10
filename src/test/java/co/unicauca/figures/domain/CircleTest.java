package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    public CircleTest() {

    }

    /**
     * Caso normal: radio 1
     */
    @Test
    public void testRadio1() {
        System.out.println("Radio 1");
        Circle instance = new Circle(1);

        double expPerimeter = Math.PI * 2;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = Math.PI;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }

    /**
     * Caso límite: radio 0
     */
    @Test
    public void testRadio0() {
        System.out.println("Radio 0");
        Circle instance = new Circle(0);

        double expPerimeter = 0.0;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = 0.0;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }

    /**
     * Caso decimal: radio 2.3
     */
    @Test
    public void testRadioDecimal() {
        System.out.println("Radio 2.3");
        Circle instance = new Circle(2.3);

        double expPerimeter = Math.PI * 2.3 * 2;
        double resultPerimeter = instance.calculatePerimeter();
        assertEquals(expPerimeter, resultPerimeter, 1e-9);

        double expArea = Math.PI * 2.3 * 2.3;
        double resultArea = instance.calculateArea();
        assertEquals(expArea, resultArea, 1e-9);
    }
}
