package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> array = new ArrayList<>();
        array.add(new Excavator("Audi", "red", 68, true));
        array.add(new Excavator("Mercedes", "blue", 35, true));
        array.add(new Excavator("Toyota", "pink", 014, true));

        return array;
    }

}
