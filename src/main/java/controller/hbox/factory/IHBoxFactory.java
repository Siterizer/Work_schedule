package controller.hbox.factory;

import model.sample.person.Person;


public interface IHBoxFactory {
    IHBox makeFirstHBox(Person p);
    IHBox makeHBox(Person p);
}
