package controller.hbox.factory;

import model.sample.person.Person;


public interface IHBoxFactory {
    IHBox makeHBox(Person p);
}
