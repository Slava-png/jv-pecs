package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String size;
    private boolean works;

    public Bulldozer() {
    }

    public Bulldozer(String color, String name, String size, boolean works) {
        super(color, name);
        this.size = size;
        this.works = works;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
