package com.heena.solid;

import java.util.List;

public class AreaCalculator {

    List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        return shapes.stream().map(Shape::area).mapToDouble(Double::doubleValue).sum();
    }
}
