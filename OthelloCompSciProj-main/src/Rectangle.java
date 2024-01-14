
public class Rectangle {
    protected Position position; // of the top left corner
    protected int width; // protected ints can be accessed by extending the class onto another class
    protected int height;

    public Rectangle(Position position, int width, int height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        this(new Position(x, y), width, height);
    }
}