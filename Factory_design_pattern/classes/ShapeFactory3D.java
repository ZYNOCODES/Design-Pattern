package Factory_design_pattern.classes;

import Factory_design_pattern.interfaces.Circle;
import Factory_design_pattern.interfaces.ShapeFactory;
import Factory_design_pattern.interfaces.Square;
import Factory_design_pattern.interfaces.Triangle;

public class ShapeFactory3D implements ShapeFactory {
    @Override
    public Circle createCircle(double area) {
        return new Circle3D(area);
    }

    @Override
    public Square createSquare(double side) {
        return new Square3D(side);
    }

    @Override
    public Triangle createTriangle(double base, double height) {
        return null;
    }

    @Override
    public Triangle createTriangle3D(double baseArea, double perimeter, double slantHeight) {
        return new Triangle3D(baseArea, perimeter, slantHeight);
    }
}
