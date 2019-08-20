package controller.hbox.factory.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

public class ButtonCreator extends Button {

    private ButtonCreator(Builder builder){
        this.setText(builder.text);
        this.setOnAction(builder.eventHandler);
        this.setPrefWidth(builder.prefWidth);
        this.setStyle(builder.style);
    }


    public static class Builder{
        private String text;
        private EventHandler<ActionEvent> eventHandler = null;
        private double prefWidth = Region.USE_COMPUTED_SIZE;
        private String style;

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setOnAction(EventHandler<ActionEvent> eventHandler){
            this.eventHandler = eventHandler;
            return this;
        }

        public Builder setPrefWidth(double prefWidth){
            this.prefWidth = prefWidth;
            return this;
        }

        public Builder setStyle(String style){
            this.style = style;
            return this;
        }

        public ButtonCreator build(){
            return new ButtonCreator(this);
        }
    }
}
