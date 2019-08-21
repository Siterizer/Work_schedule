package controller.hbox.factory.AvailabilityOfPersons.days;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.People;

public class AvailabilityOfPersonsDaysHBoxFactory implements IHBoxFactory {

    @Override
    public IHBox makeHBox(People p) {
        return new AvailabilityOfPersonsDaysHBox(p);
    }
}
