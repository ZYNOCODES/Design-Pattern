package Observer_design_pattern.classes;

import Observer_design_pattern.interfaces.Observer;
import Observer_design_pattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class ECommerce implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void productAvailable() {
        // Assume this method is called when the new iPhone model becomes available
        notifyObservers();
    }
}