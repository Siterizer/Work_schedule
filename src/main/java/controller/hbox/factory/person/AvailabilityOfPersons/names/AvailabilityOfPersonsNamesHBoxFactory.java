package controller.hbox.factory.person.AvailabilityOfPersons.names;

import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.person.IHBoxPFactory;
import model.sample.person.Person;

public class AvailabilityOfPersonsNamesHBoxPFactory implements IHBoxPFactory {
    @Override
    public IHBoxP makeFirstHBox(Person p) {
        return new AvailabilityOfPersonsNamesFirstHBoxP(p);
    }

    @Override
    public IHBoxP makeHBox(Person p) {
        return new AvailabilityOfPersonsNamesHBoxP(p);
    }
}
