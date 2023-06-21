package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;
import core.mate.academy.model.Bulldozer;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> array = new ArrayList<>();

        array.add(new Bulldozer("Man", "black", "69-i", true));
        array.add(new Bulldozer("Volvo", "grey", "79-i", true));
        array.add(new Bulldozer("Mazda", "orange", "61-i", true));

        return array;
    }
}
