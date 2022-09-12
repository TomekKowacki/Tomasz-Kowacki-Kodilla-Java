package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    static List<Shape> shapeList = new ArrayList<>();
    String figure = null;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public static void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public static void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public static String getFigure(int n) {
        String calledFigure = String.valueOf(shapeList.get(n));
        return calledFigure;
    }

    public static String showFigures() {
        String temporary = "";
        for(int i=0; i< shapeList.size(); i++){
           temporary = String.valueOf(shapeList.get(i));
        }
        return temporary;
    }
    public static int getListSize() {
        return shapeList.size();
    }
}
