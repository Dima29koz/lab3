package task1_3;

public class Circle extends  Shape{
    protected double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public double getPerimeter(){
        return this.radius * Math.PI * 2;
    }
    @Override
    public double getArea(){
        return  this.radius * this.radius * Math.PI;
    }
    @Override
    public String toString(){
        return super.toString() + "r = " + this.radius;
    }

}
