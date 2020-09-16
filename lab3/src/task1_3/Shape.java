package task1_3;

import java.lang.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape (){
        this.color = "Null";
        this.filled = false;
    }
    public Shape (String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "color: " + this.color + " filled: " + this.filled + " ";
    }
}
