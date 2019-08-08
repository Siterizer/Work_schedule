package controller.hbox.factory.components;

import javafx.scene.control.Label;

public class LabelCreator extends Label {

    private LabelCreator(Builder builder){
        this.setText(builder.text);
        this.setPrefWidth(builder.prefWidth);
    }

    public static class Builder{
        private double prefWidth = 0;
        private String text = "";

        public Builder setPrefWidth(double prefWidth){
            this.prefWidth = prefWidth;
            return this;
        }

        public Builder setText(String text){
            this.text = text;
            return this;
        }

        public LabelCreator build(){
            return new LabelCreator(this);
        }
    }
}
