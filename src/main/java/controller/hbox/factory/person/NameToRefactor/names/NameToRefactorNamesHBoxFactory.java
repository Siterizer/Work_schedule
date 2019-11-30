package controller.hbox.factory.person.NameToRefactor.names;

import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.person.IHBoxPFactory;
import model.sample.person.Person;

public class NameToRefactorNamesHBoxPFactory implements IHBoxPFactory {
    @Override
    public IHBoxP makeFirstHBox(Person p) {
        return new NameToRefactorNamesFirstHBoxP(p);
    }

    @Override
    public IHBoxP makeHBox(Person p) {
        return new NameToRefactorNamesHBoxP(p);
    }
}
