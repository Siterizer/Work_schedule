package controller.hbox.factory;

import model.sample.People;


public interface IHBoxFactory {
    IHBox makeHBox(People p);
}
