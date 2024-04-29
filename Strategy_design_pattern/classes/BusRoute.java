package Strategy_design_pattern.classes;

import Strategy_design_pattern.interfaces.Route;

public class BusRoute implements Route {
    @Override
    public int getEstimatedTravelTime() {
        return 60;
    }
}
