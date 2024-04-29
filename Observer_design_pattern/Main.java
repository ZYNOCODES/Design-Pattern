package Observer_design_pattern;


import Observer_design_pattern.classes.Customer;
import Observer_design_pattern.classes.ECommerce;

public class Main {
    public static void main(String[] args) {
        ECommerce website = new ECommerce();

        Customer customer1 = new Customer("zino@gmail.com");
        Customer customer2 = new Customer("yassine@gmail.com");
        Customer customer3 = new Customer("momentum@gmail.com");

        website.registerObserver(customer1);
        website.registerObserver(customer2);
        website.registerObserver(customer3);

        website.productAvailable(); // Notify all observers that the new iPhone model is available
    }
}
