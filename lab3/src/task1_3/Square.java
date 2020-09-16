package task1_3;

public class Square extends Rectangle{
    public Square() {}

    public Square(double width) {
        super(width, width);
    }

    public Square(String color, boolean filled, double width) {
        super(width, width, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString(){
        return "color: " + super.color + " filed: " + super.filled + " side: " + super.width;
    }
}
