package co.unicauca.figures;

import co.unicauca.figures.domain.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Figure fig1 = new Circle(1);
        Figure fig2 = new Circle(2.3);
        Figure fig3 = new Square(10);
        Figure fig4 = new Square(2.1);
        Figure fig5 = new Triangle(4.3);
        Figure fig6 = new Triangle(10.8);

        //Arreglo polimorfico
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        figures.add(fig5);
        figures.add(fig6);

        //Recorremos el arreglo y ejecutamos los metodos polimorficos
        for (Figure figure : figures) {
            System.out.printf("%s -> Area: %.4f | Perimetro: %.4f%n",
                    figure.getClass().getSimpleName(),
                    figure.calculateArea(),
                    figure.calculatePerimeter());
        }
    }
}
