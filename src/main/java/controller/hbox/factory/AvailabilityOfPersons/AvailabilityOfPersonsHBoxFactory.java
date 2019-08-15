package controller.hbox.factory.AvailabilityOfPersons;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.People;

public class AvailabilityOfPersonsHBoxFactory implements IHBoxFactory {

    @Override
    public IHBox makeHBox(People p) {
        return new AvailabilityOfPersonsHBox(p);
    }
}
