package Factory_design_pattern.classes;

import Factory_design_pattern.interfaces.Triangle;

public class Triangle3D implements Triangle {
    private double baseArea;
    private double perimeter;
    private double slantHeight;

    public Triangle3D(double baseArea, double perimeter, double slantHeight) {
        this.baseArea = baseArea;
        this.perimeter = perimeter;
        this.slantHeight = slantHeight;
    }
    @Override
    public double area() {
        return baseArea + 0.5 * perimeter * slantHeight;
    }
}
