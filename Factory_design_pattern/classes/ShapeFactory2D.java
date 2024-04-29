package Factory_design_pattern.classes;

import Factory_design_pattern.interfaces.Circle;
import Factory_design_pattern.interfaces.ShapeFactory;
import Factory_design_pattern.interfaces.Square;
import Factory_design_pattern.interfaces.Triangle;

public class ShapeFactory2D implements ShapeFactory {
    @Override
    public Circle createCircle(double radius) {
        return new Circle2D(radius);
    }

    @Override
    public Square createSquare(double side) {
        return new Square2D(side);
    }

    @Override
    public Triangle createTriangle(double base, double height) {
        return new Triangle2D(base, height);
    }

    @Override
    public Triangle createTriangle3D(double baseArea, double perimeter, double slantHeight) {
        return null;
    }
}
