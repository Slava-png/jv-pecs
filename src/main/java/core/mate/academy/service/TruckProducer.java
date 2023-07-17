package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> array = new ArrayList<>();

        array.add(new Truck("Benz", "violet", 2018, true));
        array.add(new Truck("Benz", "violet", 2001, true));
        array.add(new Truck("Benz", "violet", 1998, true));

        return array;
    }
}
