import java.awt.*;
public class BoardSquare { // extends allows the
    private int cellState; // 0=empty, 2=White, 1=Black 3 =Highlighted
    Position position;
    int width;
    int height;
    public BoardSquare(Position position, int width, int height) {
        this.position = position;
        this.height = height;
        this.width = width;

        reset();
    }

    public void reset() { //make it empty
        cellState = 0;
    }

    public void setCellState(int newState) { //1,2,3,0
        this.cellState = newState;
    }

    public int getCellState() {
        return cellState;
    }

    public void paint(Graphics g) {
        if (cellState == 3) {  //highlight Square
            g.setColor(new Color(254, 215, 22, 203));
            g.fillRect(position.x, position.y, width, height);   //width and height of rectangle
        } else if (cellState == 0) return;   // empty

        else {  //player 1 or 2 placing piece
            g.setColor(cellState == 1 ? Color.BLACK : Color.WHITE); // ternary operator (? :), which is a shorthand way of writing an if-else statement.
            g.fillOval(position.x, position.y, width, height);  // width and height of rectangle
        }
    }
}