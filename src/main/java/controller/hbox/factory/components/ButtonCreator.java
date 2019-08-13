package controller.hbox.factory.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonCreator extends Button {

    private ButtonCreator(Builder builder){
        this.setText(builder.text);
        this.setOnAction(builder.eventHandler);
    }


    public static class Builder{
        private String text;
        private EventHandler<ActionEvent> eventHandler = null;

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setOnAction(EventHandler<ActionEvent> eventHandler){
            this.eventHandler = eventHandler;
            return this;
        }

        public ButtonCreator build(){
            return new ButtonCreator(this);
        }
    }
}
