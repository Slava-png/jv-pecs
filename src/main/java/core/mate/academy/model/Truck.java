package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int year;
    private boolean works;

    public Truck() {}
    public Truck(String name, String color, int year, boolean works) {
        super(name, color);
        this.year = year;
        this.works = works;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
