package Factory_design_pattern.classes;

import Factory_design_pattern.interfaces.Circle;

public class Circle3D implements Circle {
    private double radius;
    public Circle3D(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}
