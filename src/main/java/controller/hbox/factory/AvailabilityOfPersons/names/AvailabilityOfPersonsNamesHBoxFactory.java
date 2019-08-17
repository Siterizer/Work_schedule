package controller.hbox.factory.AvailabilityOfPersons.names;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.People;

public class AvailabilityOfPersonsNamesHBoxFactory implements IHBoxFactory {
    @Override
    public IHBox makeHBox(People p) {
        return new AvailabilityOfPersonsNamesHBox(p);
    }
}
