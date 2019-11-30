package controller.hbox.factory.person.AvailabilityOfPersons.days;

import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.person.IHBoxPFactory;
import model.sample.person.Person;

public class AvailabilityOfPersonsDaysHBoxPFactory implements IHBoxPFactory {

    @Override
    public IHBoxP makeFirstHBox(Person p) {
        return new AvailabilityOfPersonsDaysFirstHBoxP(p);
    }

    @Override
    public IHBoxP makeHBox(Person p) {
        return new AvailabilityOfPersonsDaysHBoxP(p);
    }
}
