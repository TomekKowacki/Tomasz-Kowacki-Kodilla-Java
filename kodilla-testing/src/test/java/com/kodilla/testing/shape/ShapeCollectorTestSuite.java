package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: BEGIN");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: END");
    }

    @BeforeEach
    public void beforeEach() { System.out.println("Next test...");}

    @Nested
    @DisplayName("Figures menegment")
    class FigureMenegment {

        @Test
        public void testAddFigure() {
        //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
        //When
            shapeCollector.addFigure(circle);
        //Then
            Assertions.assertEquals(1, shapeCollector.getShapeList().size());
        }

        @Test
        public void testRemoveFigure() {
        //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);

        //When
            shapeCollector.removeFigure(circle);
        //Then
            Assertions.assertEquals(0, shapeCollector.getShapeList().size());
        }
    }

    @Nested
    @DisplayName("Display figures")
    class DisplayFigures {

        @Test
        void testGetFigure() {
        //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
        //When
            String result = shapeCollector.getFigure(0);
            String figureInList = String.valueOf(shapeCollector.getShapeList().get(0));
        //Then
            Assertions.assertEquals(figureInList, result);
        }

        @Test
        void testShowFigures() {
        //Given
            Shape triangle = new Triangle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            List<Shape> shapeCollection = new ArrayList<>();
            shapeCollection.add(triangle);
        //When
            List<Shape> result =shapeCollector.getShapeList();
        //Then
            Assertions.assertEquals(shapeCollection.toString(), result.toString());
        }
    }
}


