package controller.hbox.factory.AvailabilityOfPersons.days;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.person.Person;

public class AvailabilityOfPersonsDaysHBoxFactory implements IHBoxFactory {

    @Override
    public IHBox makeHBox(Person p) {
        return new AvailabilityOfPersonsDaysHBox(p);
    }
}
