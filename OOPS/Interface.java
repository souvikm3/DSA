package OOPS;

public class Interface {
    public static void main(String[] args) {
        Rook r=new Rook();
        r.moves();
    }
}
// Use of interface to achive multiple inheritance and total abstraction
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen can move any direction");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Rooks can only move horizontally or vertically.");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println(
                "Kings have unlimited movement options in all directions, but they cannot jump over other pieces and must be on the board to make a legal move.");
    }
}