package controller.hbox.factory.NameToRefactor.names;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.person.Person;

public class NameToRefactorNamesHBoxFactory implements IHBoxFactory {
    @Override
    public IHBox makeFirstHBox(Person p) {
        return new NameToRefactorNamesFirstHBox(p);
    }

    @Override
    public IHBox makeHBox(Person p) {
        return new NameToRefactorNamesHBox(p);
    }
}
