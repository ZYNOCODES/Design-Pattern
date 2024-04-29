package Strategy_design_pattern.classes;

import Strategy_design_pattern.interfaces.Route;

public class Navigator {
    private Route route;

    public void setRouteStrategy(Route route) {
        this.route = route;
    }

    public int getEstimatedTravelTime() {
        return route.getEstimatedTravelTime();
    }
}
