package controller.hbox.factory.person.RemovePerson;

import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.person.IHBoxPFactory;
import model.sample.person.Person;

public class RemovePersonHBoxFactory implements IHBoxPFactory {

    @Override
    public IHBoxP makeFirstHBox(Person p) {
        return null;
    }

    @Override
    public IHBoxP makeHBox(Person p) {
        return new RemovePersonHBox(p);
    }
}
