package Strategy_design_pattern;


import Strategy_design_pattern.classes.*;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        // Client chooses the strategy (transportation method)
        navigator.setRouteStrategy(new CarRoute());
        System.out.println("Car: " + navigator.getEstimatedTravelTime() + " minutes");

        navigator.setRouteStrategy(new BusRoute());
        System.out.println("Bus: " + navigator.getEstimatedTravelTime() + " minutes");

        navigator.setRouteStrategy(new WalkingRoute());
        System.out.println("Walking: " + navigator.getEstimatedTravelTime() + " minutes");

        navigator.setRouteStrategy(new CyclingRoute());
        System.out.println("Cycling: " + navigator.getEstimatedTravelTime() + " minutes");
    }
}
