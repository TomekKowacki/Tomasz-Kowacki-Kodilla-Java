package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public String getFigure(int n) {
        if(n<shapeList.size() && n>=0) {
            return String.valueOf(shapeList.get(n));
        } else {
            return null;
        }
    }

    public void showFigures() {
       System.out.println(shapeList.toString());
    }
    public int getListSize() {
        return shapeList.size();
    }
}
