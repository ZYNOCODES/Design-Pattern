package Factory_design_pattern.classes;

import Factory_design_pattern.interfaces.Triangle;

public class Triangle2D implements Triangle {
    private double base;
    private double height;

    public Triangle2D(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
