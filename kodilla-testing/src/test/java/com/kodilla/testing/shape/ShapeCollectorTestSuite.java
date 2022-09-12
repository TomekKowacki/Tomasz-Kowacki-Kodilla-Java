package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static com.kodilla.testing.shape.ShapeCollector.shapeList;

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
        void testAddFigure() {
        //Given
            Shape circle = new Circle();
            Shape triangle = new Triangle();
            Shape square = new Square();

            ShapeCollector shapeCollector = new ShapeCollector(circle);
            ShapeCollector shapeCollector1 = new ShapeCollector(triangle);
            ShapeCollector shapeCollector2 = new ShapeCollector(square);
        //When
            shapeList.clear();
            ShapeCollector.addFigure(circle);
            ShapeCollector.addFigure(triangle);
            ShapeCollector.addFigure(square);
        //Then
            Assertions.assertEquals(3, ShapeCollector.getListSize());
            shapeList.clear();
        }

        @Test
        void testRemoveFigure() {
        //Given
            Shape circle = new Circle();
            Shape triangle = new Triangle();
            Shape square = new Square();

            ShapeCollector shapeCollector = new ShapeCollector(circle);
            ShapeCollector shapeCollector1 = new ShapeCollector(triangle);
            ShapeCollector shapeCollector2 = new ShapeCollector(square);

            shapeList.add(circle);
            shapeList.add(triangle);
            shapeList.add(square);
        //When
            ShapeCollector.removeFigure(circle);
            ShapeCollector.removeFigure(triangle);
            ShapeCollector.removeFigure(square);
        //Then
            Assertions.assertEquals(0, shapeList.size());
            shapeList.clear();
        }
    }

    @Nested
    @DisplayName("Display figures")
    class DisplayFigures {

        @Test
        void testGetFigure() {
        //Given
            Shape circle = new Circle();

            ShapeCollector shapeCollector = new ShapeCollector(circle);

            shapeList.add(circle);
        //When
            String result = ShapeCollector.getFigure(0);
            String figureInList = String.valueOf(shapeList.get(0));
        //Then
            Assertions.assertEquals(figureInList, result);
            shapeList.clear();
        }

        @Test
        void testShowFigures() {
        //Given
            Shape triangle = new Triangle();

            ShapeCollector shapeCollector = new ShapeCollector(triangle);

            shapeList.add(triangle);
        //When
            String figures = ShapeCollector.showFigures();
        //Then
            Assertions.assertEquals(String.valueOf(shapeList.get(0)), figures);
            shapeList.clear();
        }
    }
}


