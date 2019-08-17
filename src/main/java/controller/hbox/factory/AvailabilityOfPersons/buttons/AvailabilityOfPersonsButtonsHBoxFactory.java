package controller.hbox.factory.AvailabilityOfPersons.buttons;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.People;

public class AvailabilityOfPersonsButtonsHBoxFactory implements IHBoxFactory {

    @Override
    public IHBox makeHBox(People p) {
        return new AvailabilityOfPersonsButtonsHBox(p);
    }
}
