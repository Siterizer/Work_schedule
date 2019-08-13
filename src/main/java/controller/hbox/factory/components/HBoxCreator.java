package controller.hbox.factory.components;

import javafx.scene.layout.HBox;

public class HBoxCreator extends  HBox {

    private HBoxCreator(Builder builder){
        this.setPrefHeight(builder.prefHeight);
        this.setPrefWidth(builder.prefWidth);
    }
    public static class Builder{
        private double prefHeight = 0;
        private double prefWidth = 0;

        public Builder setPrefHeight(double prefHeight){
            this.prefHeight = prefHeight;
            return this;
        }
        public Builder setPrefWidth(double prefWidth){
            this.prefWidth = prefWidth;
            return this;
        }
        public HBoxCreator build(){
            return new HBoxCreator(this);
        }
    }
}
