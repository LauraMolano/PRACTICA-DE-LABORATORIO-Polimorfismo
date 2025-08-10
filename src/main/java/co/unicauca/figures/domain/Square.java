package co.unicauca.figures.domain;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSlide() {
        return side;
    }

    public void setSlide(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
