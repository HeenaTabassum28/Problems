package com.heena.solid;

import java.util.List;

public class SolidImpl {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(2),
                new Square(5),
                new Square(6));
        System.out.println(new AreaCalculator(shapes).sum());
    }
}
