package task4_5;

public class TestMove {
    public static void main(String[] args) {
        MovableCircle Cir1 = new MovableCircle(1, 2, 1, 2, 3);
        MovableRectangle Rec1 = new MovableRectangle(1, 2, 0, 0, 1, 2);
        for (int i=0; i<10; i++)
        {
            System.out.println(Cir1);
            Cir1.moveDown();
        }
        for (int i=0; i<10; i++)
        {
            System.out.println(Rec1);
            Rec1.moveDown();
            Rec1.moveRight();
        }
    }
}
