package Factory_design_pattern.classes;

import Factory_design_pattern.interfaces.Square;

public class Square3D implements Square {
    private double side;
    public Square3D(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return 6 * side * side;
    }
}
