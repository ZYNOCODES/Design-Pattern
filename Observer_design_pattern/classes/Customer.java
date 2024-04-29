package Observer_design_pattern.classes;

import Observer_design_pattern.interfaces.Observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + ": The new iPhone model is available!");
    }
}