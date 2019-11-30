package controller.hbox.factory.person.AvailabilityOfPersons.names;

import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.person.IHBoxPFactory;
import model.sample.person.Person;

public class AvailabilityOfPersonsNamesHBoxFactory implements IHBoxPFactory {
    @Override
    public IHBoxP makeFirstHBox(Person p) {
        return new AvailabilityOfPersonsNamesFirstHBox(p);
    }

    @Override
    public IHBoxP makeHBox(Person p) {
        return new AvailabilityOfPersonsNamesHBox(p);
    }
}
