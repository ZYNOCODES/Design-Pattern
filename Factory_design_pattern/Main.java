package Factory_design_pattern;


import Factory_design_pattern.classes.ShapeFactory2D;
import Factory_design_pattern.classes.ShapeFactory3D;
import Factory_design_pattern.interfaces.Circle;
import Factory_design_pattern.interfaces.ShapeFactory;
import Factory_design_pattern.interfaces.Square;
import Factory_design_pattern.interfaces.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        //2D
        ShapeFactory shapeFactory2D = new ShapeFactory2D();
        Circle circle2D = shapeFactory2D.createCircle(14);
        Square square2D = shapeFactory2D.createSquare(14);
        Triangle triangle2D = shapeFactory2D.createTriangle(6, 10);

        System.out.println("Area of Circle 2D: " + circle2D.area());
        System.out.println("Area of Square 2D: " + square2D.area());
        System.out.println("Area of Triangle 2D: " + triangle2D.area());

        System.out.println("-------------------------------------------------");

        //3D
        ShapeFactory shapeFactory3D = new ShapeFactory3D();
        Circle circle3D = shapeFactory3D.createCircle(14);
        Square square3D = shapeFactory3D.createSquare(14);
        Triangle triangle3D = shapeFactory3D.createTriangle3D(6, 10, 3);

        System.out.println("Area of Circle 3D: " + circle3D.area());
        System.out.println("Area of Square 3D: " + square3D.area());
        System.out.println("Area of Triangle 3D: " + triangle3D.area());

        System.out.println("-------------------------------------------------");
    }
}