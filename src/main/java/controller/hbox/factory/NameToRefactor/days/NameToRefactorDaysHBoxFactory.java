package controller.hbox.factory.NameToRefactor.days;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import model.sample.person.Person;

public class NameToRefactorDaysHBoxFactory implements IHBoxFactory {
    @Override
    public IHBox makeFirstHBox(Person p) {
        return new NameToRefactorDaysFirstHBox(p);
    }

    @Override
    public IHBox makeHBox(Person p) {
        return new NameToRefactorDaysHBox(p);
    }
}
