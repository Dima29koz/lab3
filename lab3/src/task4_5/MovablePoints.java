package task4_5;

public class MovablePoints implements Movable{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int xSpeed;
    private int ySpeed;

    public MovablePoints(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoints{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        this.x1 +=this.xSpeed;
        this.x2 +=this.xSpeed;
    }

    @Override
    public void moveDown() {
        this.x1 -=this.xSpeed;
        this.x2 -=this.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.y1 -=this.ySpeed;
        this.y2 -=this.ySpeed;
    }

    @Override
    public void moveRight() {
        this.y1 +=this.ySpeed;
        this.y2 +=this.ySpeed;
    }
}
