package controller.hbox.factory.person;

import model.sample.person.Person;


public interface IHBoxPFactory {
    IHBoxP makeFirstHBox(Person p);
    IHBoxP makeHBox(Person p);
}
