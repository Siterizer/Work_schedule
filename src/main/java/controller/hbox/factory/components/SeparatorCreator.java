package controller.hbox.factory.components;

import javafx.scene.control.Separator;

public class SeparatorCreator extends Separator {

    private SeparatorCreator(Builder builder){
        this.setPrefHeight(builder.prefHeight);
        this.setPrefWidth(builder.prefWidth);
        this.setVisible(builder.visible);
    }

    public static class Builder{
        private double prefHeight = 0;
        private double prefWidth = 0;
        private boolean visible = false;

        public Builder setPrefHeight(double prefHeight){
            this.prefHeight = prefHeight;
            return this;
        }

        public Builder setPrefWidth(double prefWidth){
            this.prefWidth = prefWidth;
            return this;
        }

        public Builder setVisible(boolean visible){
            this.visible = visible;
            return this;
        }

        public SeparatorCreator build(){
            return new SeparatorCreator(this);
        }

    }
}
