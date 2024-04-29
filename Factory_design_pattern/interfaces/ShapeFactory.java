package Factory_design_pattern.interfaces;

public interface ShapeFactory {
    Circle createCircle(double radius);
    Square createSquare(double side);
    Triangle createTriangle(double base, double height);
    Triangle createTriangle3D(double baseArea, double perimeter, double slantHeight);

}
