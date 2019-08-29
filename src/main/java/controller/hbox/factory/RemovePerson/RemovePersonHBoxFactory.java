package controller.hbox.factory.RemovePerson;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.person.Person;

public class RemovePersonHBoxFactory implements IHBoxFactory {

    @Override
    public IHBox makeHBox(Person p) {
        return new RemovePersonHBox(p);
    }
}
