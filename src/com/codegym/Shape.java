package com.codegym;

public class Shape {
    private String color="green" ;
    private Boolean filled=true;
    public Shape(){};
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }
    public String toString(){
        return "A shape with color of "+getColor()+" and "+(getFilled()? "filled" : "not filled");
    }
}
