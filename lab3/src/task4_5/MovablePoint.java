package task4_5;
import java.lang.*;
public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y;
    }

    @Override
    public void moveUp() {
        this.x +=this.xSpeed;
    }

    @Override
    public void moveDown() {
        this.x -=this.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.y -=this.ySpeed;
    }

    @Override
    public void moveRight() {
        this.y +=this.ySpeed;
    }
}
