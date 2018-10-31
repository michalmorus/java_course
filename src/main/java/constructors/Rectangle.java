package constructors;

public class Rectangle {

    private int x;

    private int y;

    private Rectangle(int x) {
        this.x = x;
    }

    public Rectangle(int x, int y) {
        this(x);
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
