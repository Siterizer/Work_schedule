package controller.hbox.factory.person.NameToRefactor.days;

import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.person.IHBoxPFactory;
import model.sample.person.Person;

public class NameToRefactorDaysHBoxPFactory implements IHBoxPFactory {
    @Override
    public IHBoxP makeFirstHBox(Person p) {
        return new NameToRefactorDaysFirstHBoxP(p);
    }

    @Override
    public IHBoxP makeHBox(Person p) {
        return new NameToRefactorDaysHBoxP(p);
    }
}
