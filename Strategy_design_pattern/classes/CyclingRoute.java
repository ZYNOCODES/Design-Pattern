package Strategy_design_pattern.classes;

import Strategy_design_pattern.interfaces.Route;

public class CyclingRoute implements Route {
    @Override
    public int getEstimatedTravelTime() {
        return 50;
    }
}
