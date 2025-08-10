package co.unicauca.figures.domain;

public class Triangle implements Figure {

    private double base, high;

    public Triangle(double base) {
        this.base = base;
        this.high = (Math.sqrt(3) / 2.0) * base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * base;
    }

    @Override
    public double calculateArea() {
        return (base * high) / 2.0;
    }
}
