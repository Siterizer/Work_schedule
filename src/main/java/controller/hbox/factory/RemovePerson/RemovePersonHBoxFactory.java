package controller.hbox.factory.RemovePerson;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.People;

public class RemovePersonHBoxFactory implements IHBoxFactory {

    @Override
    public IHBox makeHBox(People p) {
        return new RemovePersonHBox(p);
    }
}