package ooplab9;

public class CarApp {

    public static void main(String[] args) {
        Engine e = new Engine("1500 cc", "R15");
        Car c = new Car("YAMAHA", "City", "BLUE", e);

        System.out.println(c.toString());

    }
}