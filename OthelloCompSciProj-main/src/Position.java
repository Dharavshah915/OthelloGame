
public class Position {

    public static Position DOWN = new Position(0,-1);
    public static Position UP = new Position(0,1);
    public static Position LEFT = new Position(-1,0);
    public static Position RIGHT = new Position(1,0);


    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position positionOfOther) {
        this.x = positionOfOther.x;
        this.y = positionOfOther.y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }

    public void add(Position otherPosition) {
        this.x += otherPosition.x;
        this.y += otherPosition.y;
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;  // change type
        return x == position.x && y == position.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
