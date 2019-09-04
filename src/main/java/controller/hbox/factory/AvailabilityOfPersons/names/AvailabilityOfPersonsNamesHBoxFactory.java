package controller.hbox.factory.AvailabilityOfPersons.names;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.person.Person;

public class AvailabilityOfPersonsNamesHBoxFactory implements IHBoxFactory {
    @Override
    public IHBox makeFirstHBox(Person p) {
        return new AvailabilityOfPersonsNamesFirstHBox(p);
    }

    @Override
    public IHBox makeHBox(Person p) {
        return new AvailabilityOfPersonsNamesHBox(p);
    }
}
