
public class Square {

    public int side;

    public Square(int side) {
        this.side = side;

        
    }

    public Square(Square sq) {
        this(sq.side);

    }

    @Override
    public String toString() {
        return
        super.toString() + "\n" + "Square {side: %s}";
    }

}
