package controller.hbox.factory;

import model.sample.People;

public class RemovePersonHBoxFactory implements IHBoxFactory {

    @Override
    public IHBox makeHBox(People p) {
        return new RemovePersonHBox(p);
    }
}
